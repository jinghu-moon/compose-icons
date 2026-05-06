package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Cherry: ImageVector
    get() {
        if (_cherry != null) return _cherry!!
        _cherry = tablerFilledIcon(
            name = "Cherry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.588 5.191l.058 .045 .078 .074 .072 .084 .013 .018c.153 .209 .218 .47 .182 .727l-.022 .111-.03 .092c-.99 2.725-.666 5.158 .679 7.706 2.078 .325 3.549 2.203 3.367 4.298-.182 2.095-1.956 3.691-4.058 3.653-2.103-.039-3.816-1.699-3.922-3.799L13 18l.005-.2c.078-1.557 1.054-2.928 2.5-3.511C14.558 12.259 14.163 10.224 14.453 8.082c-.166 .077-.332 .15-.499 .218l.094-.064c-2.243 1.47-3.552 3.004-3.98 4.57 1.732 1.205 2.395 3.451 1.594 5.403-.801 1.952-2.851 3.085-4.93 2.726C4.653 20.575 3.103 18.82 3.004 16.712L3 16.5l.005-.212c.06-1.278 .662-2.471 1.654-3.278 .992-.808 2.282-1.155 3.546-.955 .332-1.073 .945-2.096 1.83-3.069C8.241 8.89 6.449 8.227 4.68 7L4.412 6.81 4.361 6.77 4.315 6.73 4.271 6.686 4.231 6.64 4.191 6.59 4.159 6.543 4.124 6.483 4.071 6.373 4.033 6.257 4.01 6.14 4.005 6.098 4 5.98l.01-.118 .023-.117 .038-.115 .03-.066 .023-.045 .035-.06 .032-.046 .04-.051 .04-.046 .044-.044 .046-.04 .05-.04c4.018-2.922 8.16-2.922 12.177 0Z"),
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
        return _cherry!!
    }

private var _cherry: ImageVector? = null
