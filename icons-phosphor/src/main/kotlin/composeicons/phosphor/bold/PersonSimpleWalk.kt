package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonSimpleWalk: ImageVector
    get() {
        if (_personSimpleWalk != null) return _personSimpleWalk!!
        _personSimpleWalk = phosphorBoldIcon(
            name = "PersonSimpleWalk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 84c19.882 0 36-16.118 36-36C188 28.118 171.882 12 152 12c-19.882 0-36 16.118-36 36 0 19.882 16.118 36 36 36ZM152 36c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM220 148c0 6.627-5.373 12-12 12-37 0-55.27-18.47-70-33.3-1.71-1.72-3.36-3.4-5-5l-8.63 19.85L159 166.23c3.146 2.259 5.007 5.897 5 9.77v56c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-49.83L114.63 164.05 83 236.78c-1.633 4.047-5.334 6.889-9.665 7.421-4.331 .532-8.61-1.329-11.174-4.861C59.597 235.809 59.152 231.164 61 227.21L111.06 112.08q-10.64 .75-25 8.4c-10.724 5.91-20.733 13.034-29.83 21.23-4.832 4.537-12.428 4.297-16.965-.535-4.537-4.832-4.297-12.428 .535-16.965 2.61-2.45 64.36-59.67 104.09-25.18 3.94 3.42 7.64 7.16 11.22 10.78C168.43 123.28 181 136 208 136c6.627 0 12 5.373 12 12Z"),
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
        return _personSimpleWalk!!
    }

private var _personSimpleWalk: ImageVector? = null
