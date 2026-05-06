package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MarkerCircle: ImageVector
    get() {
        if (_markerCircle != null) return _markerCircle!!
        _markerCircle = phosphorBoldIcon(
            name = "MarkerCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204.37 51.6C167.92 15.125 110.78 9.48 67.897 38.117 25.015 66.755 8.335 121.697 28.06 169.341c19.725 47.644 70.36 74.718 120.935 64.663C199.571 223.949 235.999 179.565 236 128 235.999 99.348 224.623 71.868 204.37 51.6ZM108 140h40v16h-40ZM92 203.92v-23.92h72v23.9c-22.791 10.767-49.203 10.774-72 .02ZM188 186.79v-10.79c.002-9.505-6.687-17.699-16-19.6v-20.4c-.007-9.056-6.099-16.978-14.85-19.31L147.27 81.2C144.865 72.544 136.984 66.554 128 66.554c-8.984 0-16.865 5.99-19.27 14.646l-9.88 35.49C90.099 119.022 84.007 126.944 84 136v20.42C74.694 158.32 68.008 166.502 68 176v10.77C35.688 153.792 36.048 100.919 68.805 68.384c32.757-32.535 85.632-32.535 118.389 0 32.757 32.535 33.117 85.409 .805 118.386Z"),
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
        return _markerCircle!!
    }

private var _markerCircle: ImageVector? = null
