package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileCode: ImageVector
    get() {
        if (_fileCode != null) return _fileCode!!
        _fileCode = phosphorLightIcon(
            name = "FileCode",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180.24 147.76c2.34 2.343 2.34 6.137 0 8.48l-24 24c-2.364 2.203-6.048 2.138-8.333-.147-2.285-2.285-2.35-5.969-.147-8.333L167.51 152 147.76 132.24c-1.605-1.496-2.266-3.748-1.723-5.874 .543-2.126 2.203-3.786 4.329-4.329 2.126-.543 4.379 .118 5.874 1.723ZM108.24 123.76c-2.343-2.34-6.137-2.34-8.48 0l-24 24c-2.34 2.343-2.34 6.137 0 8.48l24 24c1.496 1.605 3.748 2.266 5.874 1.723 2.126-.543 3.786-2.203 4.329-4.329 .543-2.126-.118-4.379-1.723-5.874L88.49 152l19.75-19.76c2.34-2.343 2.34-6.137 0-8.48ZM214 88v128c0 7.732-6.268 14-14 14h-144c-7.732 0-14-6.268-14-14v-176C42 32.268 48.268 26 56 26h96c1.594-.001 3.123 .632 4.25 1.76l56 56c1.122 1.126 1.751 2.651 1.75 4.24ZM158 82h35.52L158 46.48ZM202 216v-122h-50c-3.314 0-6-2.686-6-6v-50h-90c-1.105 0-2 .895-2 2v176c0 1.105 .895 2 2 2h144c1.105 0 2-.895 2-2Z"),
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
        return _fileCode!!
    }

private var _fileCode: ImageVector? = null
