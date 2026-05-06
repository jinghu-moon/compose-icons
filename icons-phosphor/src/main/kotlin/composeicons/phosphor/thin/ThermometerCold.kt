package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ThermometerCold: ImageVector
    get() {
        if (_thermometerCold != null) return _thermometerCold!!
        _thermometerCold = phosphorThinIcon(
            name = "ThermometerCold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M247.67 73.92l-25.2 8.18L238 103.54c.888 1.153 1.079 2.698 .499 4.033-.58 1.335-1.839 2.25-3.288 2.388-1.449 .139-2.859-.521-3.681-1.721L216 86.81l-15.57 21.43c-.753 1.037-1.958 1.651-3.24 1.65-1.503-.003-2.877-.847-3.558-2.186-.681-1.339-.554-2.948 .328-4.164L209.53 82.1 184.33 73.92c-2.101-.682-3.252-2.939-2.57-5.04 .682-2.101 2.939-3.252 5.04-2.57L212 74.49v-26.49c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v26.49l25.2-8.18c2.101-.682 4.358 .469 5.04 2.57 .682 2.101-.469 4.358-2.57 5.04ZM148 184c.001 14.944-11.733 27.256-26.661 27.971-14.927 .715-27.785-10.419-29.211-25.295C90.701 171.799 101.209 158.425 116 156.29v-36.29c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v36.29c13.775 1.988 23.999 13.792 24 27.71ZM140 184c0-11.046-8.954-20-20-20-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20 11.046 0 20-8.954 20-20ZM180 184c0 28.216-19.659 52.619-47.228 58.625-27.569 6.006-55.598-8.008-67.334-33.667C53.7 183.299 61.427 152.929 84 136v-88C84 28.118 100.118 12 120 12c19.882 0 36 16.118 36 36v88c15.101 11.337 23.991 29.117 24 48ZM172 184c-.009-17.014-8.332-32.951-22.29-42.68-1.083-.756-1.723-1.999-1.71-3.32v-90C148 32.536 135.464 20 120 20 104.536 20 92 32.536 92 48v90c0 1.307-.638 2.532-1.71 3.28C70.036 155.38 62.483 181.773 72.21 204.453c9.727 22.68 34.056 35.4 58.231 30.445C154.616 229.943 171.98 208.678 172 184Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _thermometerCold!!
    }

private var _thermometerCold: ImageVector? = null
