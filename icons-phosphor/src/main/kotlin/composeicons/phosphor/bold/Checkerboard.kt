package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Checkerboard: ImageVector
    get() {
        if (_checkerboard != null) return _checkerboard!!
        _checkerboard = phosphorBoldIcon(
            name = "Checkerboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 48C228 36.954 219.046 28 208 28h-160C36.954 28 28 36.954 28 48v160c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20ZM193 116 140 63v-11h11l53 53v11ZM140 97l19 19h-19ZM204 71 185 52h19ZM116 52v16h0v48h-64v-64ZM105 204 52 151v-11h11l53 53v11ZM116 159 97 140h19ZM52 185l19 19h-19ZM140 204v-16h0v-48h64v64Z"),
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
