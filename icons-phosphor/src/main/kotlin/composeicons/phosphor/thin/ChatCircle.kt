package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatCircle: ImageVector
    get() {
        if (_chatCircle != null) return _chatCircle!!
        _chatCircle = phosphorThinIcon(
            name = "ChatCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C92.578 27.993 59.795 46.726 41.818 77.248c-17.978 30.521-18.467 68.275-1.288 99.252L28.63 212.19c-1.438 4.312-.316 9.067 2.898 12.282 3.214 3.214 7.969 4.337 12.282 2.898L79.5 215.47c36.58 20.269 81.911 15.634 113.632-11.619 31.722-27.253 43.134-71.367 28.609-110.584C207.216 54.051 169.821 28.014 128 28ZM128 220c-16.175 .005-32.066-4.255-46.07-12.35-.609-.35-1.298-.536-2-.54-.432-0-.861 .071-1.27 .21L41.28 219.78c-1.437 .479-3.022 .105-4.094-.966-1.071-1.071-1.446-2.656-.966-4.094L48.68 177.34c.364-1.087 .243-2.278-.33-3.27C27.495 138.022 33.457 92.461 62.884 62.992 92.312 33.523 137.865 27.498 173.942 48.301c36.077 20.804 53.68 63.248 42.916 103.479C206.093 192.011 169.646 219.993 128 220Z"),
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
        return _chatCircle!!
    }

private var _chatCircle: ImageVector? = null
