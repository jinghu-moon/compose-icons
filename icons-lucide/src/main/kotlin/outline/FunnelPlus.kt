package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FunnelPlus: ImageVector
    get() {
        if (_funnelPlus != null) return _funnelPlus!!
        _funnelPlus = lucideOutlineIcon(
            name = "FunnelPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 13.354 3.000 L 3.000 3.000 C 2.605 3.000 2.247 3.233 2.087 3.594 C 1.926 3.955 1.993 4.377 2.258 4.670 L 9.483 12.659 C 9.816 13.027 10.000 13.504 10.000 14.000 L 10.000 20.000 C 10.000 20.379 10.214 20.726 10.553 20.895 L 12.553 21.895 C 12.863 22.050 13.231 22.033 13.526 21.851 C 13.821 21.669 14.000 21.347 14.000 21.000 L 14.000 14.000 C 14.000 13.504 14.184 13.027 14.517 12.659 L 15.735 11.311"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 16.000 6.000 L 22.000 6.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 19.000 3.000 L 19.000 9.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _funnelPlus!!
    }

private var _funnelPlus: ImageVector? = null
