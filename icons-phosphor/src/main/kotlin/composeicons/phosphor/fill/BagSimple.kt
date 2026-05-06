package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BagSimple: ImageVector
    get() {
        if (_bagSimple != null) return _bagSimple!!
        _bagSimple = phosphorFillIcon(
            name = "BagSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 64h-40C176 37.49 154.51 16 128 16 101.49 16 80 37.49 80 64h-40C31.163 64 24 71.163 24 80v120c0 8.837 7.163 16 16 16h176c8.837 0 16-7.163 16-16v-120c0-8.837-7.163-16-16-16ZM128 32c17.673 0 32 14.327 32 32h-64C96 46.327 110.327 32 128 32Z"),
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
        return _bagSimple!!
    }

private var _bagSimple: ImageVector? = null
