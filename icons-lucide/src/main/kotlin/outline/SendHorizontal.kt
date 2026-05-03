package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SendHorizontal: ImageVector
    get() {
        if (_sendHorizontal != null) return _sendHorizontal!!
        _sendHorizontal = lucideOutlineIcon(
            name = "SendHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.714 3.048 C 3.530 2.958 3.310 2.990 3.159 3.129 C 3.008 3.267 2.957 3.484 3.031 3.675 L 5.874 11.302 C 6.042 11.752 6.042 12.248 5.874 12.698 L 3.032 20.325 C 2.959 20.516 3.009 20.732 3.160 20.870 C 3.310 21.009 3.530 21.041 3.714 20.952 L 21.714 12.452 C 21.889 12.369 22.000 12.193 22.000 12.000 C 22.000 11.807 21.889 11.631 21.714 11.548 Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 6.000 12.000 L 22.000 12.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _sendHorizontal!!
    }

private var _sendHorizontal: ImageVector? = null
