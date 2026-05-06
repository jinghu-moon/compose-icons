package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ThermometerSimple: ImageVector
    get() {
        if (_thermometerSimple != null) return _thermometerSimple!!
        _thermometerSimple = phosphorThinIcon(
            name = "ThermometerSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M132 156.29v-68.29c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v68.29c-14.535 2.098-24.98 15.07-23.928 29.718 1.052 14.648 13.242 25.995 27.928 25.995 14.686 0 26.876-11.347 27.928-25.995C156.98 171.36 146.535 158.388 132 156.29ZM128 204c-11.046 0-20-8.954-20-20 0-11.046 8.954-20 20-20 11.046 0 20 8.954 20 20 0 11.046-8.954 20-20 20ZM164 136v-88C164 28.118 147.882 12 128 12 108.118 12 92 28.118 92 48v88C71.339 151.495 62.912 178.473 71.079 202.974 79.246 227.474 102.174 244 128 244c25.826 0 48.754-16.526 56.921-41.026C193.088 178.473 184.661 151.495 164 136ZM128 236c-22.723 .002-42.816-14.751-49.619-36.431-6.803-21.681 1.259-45.268 19.909-58.249 1.083-.756 1.723-1.999 1.71-3.32v-90c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28v90c-0 1.307 .638 2.532 1.71 3.28 18.687 12.969 26.776 36.579 19.969 58.283C170.871 221.267 150.747 236.027 128 236Z"),
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
        return _thermometerSimple!!
    }

private var _thermometerSimple: ImageVector? = null
