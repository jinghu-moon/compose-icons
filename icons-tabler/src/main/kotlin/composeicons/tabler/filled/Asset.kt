package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Asset: ImageVector
    get() {
        if (_asset != null) return _asset!!
        _asset = tablerFilledIcon(
            name = "Asset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 2c.957-0 1.858 .456 2.423 1.229 .565 .773 .728 1.769 .437 2.681l-.107 .291-.046 .093q-.061 .128-.134 .25L15.097 18.453c-.02 .036-.042 .071-.066 .104-1.603 2.72-4.828 4.031-7.874 3.199C4.111 20.925 1.998 18.157 2 15l.004-.24C2.084 12.409 3.34 10.256 5.346 9.028l.256-.15L17.307 2.523q.18-.123 .378-.22l.215-.096 .136-.048C18.338 2.056 18.663 2 19 2M9 12C7.411 12 6.098 13.238 6.005 14.824L6 15c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C12 13.343 10.657 12 9 12M16.04 5.488 10.92 8.266c2.332 .667 4.153 2.491 4.816 4.824L18.524 7.962C17.25 7.758 16.249 6.761 16.039 5.488M19 4c-.108-0-.215 .017-.317 .051l-.31 .17c-.308 .248-.44 .654-.339 1.035 .101 .382 .418 .668 .808 .731 .39 .063 .78-.11 .996-.441l.072-.13c.142-.31 .116-.67-.068-.957C19.658 4.173 19.341 4 19 4"),
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
        return _asset!!
    }

private var _asset: ImageVector? = null
