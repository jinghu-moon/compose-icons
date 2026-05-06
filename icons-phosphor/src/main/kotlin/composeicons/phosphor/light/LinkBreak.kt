package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LinkBreak: ImageVector
    get() {
        if (_linkBreak != null) return _linkBreak!!
        _linkBreak = phosphorLightIcon(
            name = "LinkBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 56C186.746 42.764 165.282 42.741 152 55.95L140.34 68.14c-1.464 1.617-3.689 2.313-5.813 1.817-2.124-.496-3.811-2.106-4.407-4.204-.596-2.098-.006-4.354 1.541-5.893L143.37 47.58l.1-.11c17.966-17.966 47.094-17.966 65.06 0 17.966 17.966 17.966 47.094 0 65.06l-.11 .1-12.28 11.71c-1.538 1.546-3.794 2.136-5.893 1.541-2.098-.596-3.708-2.283-4.204-4.407-.496-2.124 .199-4.35 1.817-5.813L200.09 104C213.288 90.707 213.247 69.243 200 56ZM115.62 187.9 104 200.09c-13.28 13.28-34.81 13.28-48.09 0C42.63 186.81 42.63 165.28 55.91 152L68.14 140.33c2.294-2.306 2.332-6.019 .088-8.373-2.245-2.353-5.956-2.49-8.368-.307L47.58 143.37l-.11 .1c-17.966 17.966-17.966 47.094 0 65.06 17.966 17.966 47.094 17.966 65.06 0l.1-.11 11.71-12.28c1.546-1.538 2.136-3.794 1.541-5.893-.596-2.098-2.283-3.708-4.407-4.204-2.124-.496-4.35 .199-5.813 1.817ZM216 154h-24c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h24c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM40 102h24c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-24c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6ZM160 186c-3.314 0-6 2.686-6 6v24c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-24c0-3.314-2.686-6-6-6ZM96 70c3.314 0 6-2.686 6-6v-24c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v24c0 3.314 2.686 6 6 6Z"),
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
        return _linkBreak!!
    }

private var _linkBreak: ImageVector? = null
