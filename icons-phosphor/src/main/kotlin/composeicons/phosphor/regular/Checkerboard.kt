package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Checkerboard: ImageVector
    get() {
        if (_checkerboard != null) return _checkerboard!!
        _checkerboard = phosphorRegularIcon(
            name = "Checkerboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM195.31 120 136 60.69v-12.69h12.69L208 107.32v12.68ZM136 83.31 172.69 120h-36.69ZM208 84.69 171.31 48h36.69ZM120 48v72h-72v-72ZM107.31 208 48 148.69v-12.69h12.69L120 195.31v12.69ZM120 172.69 83.31 136h36.69ZM48 171.31 84.69 208h-36.69ZM208 208h-72v-72h72v72Z"),
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
        return _checkerboard!!
    }

private var _checkerboard: ImageVector? = null
