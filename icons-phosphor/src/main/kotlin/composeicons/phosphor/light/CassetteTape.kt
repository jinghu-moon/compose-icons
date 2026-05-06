package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CassetteTape: ImageVector
    get() {
        if (_cassetteTape != null) return _cassetteTape!!
        _cassetteTape = phosphorLightIcon(
            name = "CassetteTape",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 50h-192C24.268 50 18 56.268 18 64v128c0 7.732 6.268 14 14 14h192c7.732 0 14-6.268 14-14v-128c0-7.732-6.268-14-14-14ZM76 194 91 174h74l15 20ZM226 192c0 1.105-.895 2-2 2h-29L172.8 164.4C171.667 162.889 169.889 162 168 162h-80c-1.889 0-3.667 .889-4.8 2.4L61 194h-29c-1.105 0-2-.895-2-2v-128c0-1.105 .895-2 2-2h192c1.105 0 2 .895 2 2ZM176 82h-96C63.431 82 50 95.431 50 112c0 16.569 13.431 30 30 30h96c16.569 0 30-13.431 30-30C206 95.431 192.569 82 176 82ZM152 94c-8.027 10.658-8.027 25.342 0 36h-48c8.027-10.658 8.027-25.342 0-36ZM62 112c0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18ZM176 130c-9.941 0-18-8.059-18-18 0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18Z"),
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
        return _cassetteTape!!
    }

private var _cassetteTape: ImageVector? = null
