package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ClockUser: ImageVector
    get() {
        if (_clockUser != null) return _clockUser!!
        _clockUser = phosphorLightIcon(
            name = "ClockUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M134 72v46.29L173.32 98.63c2.966-1.48 6.57-.276 8.05 2.69 1.48 2.966 .276 6.57-2.69 8.05l-48 24c-1.86 .929-4.069 .828-5.837-.266C123.075 132.01 121.999 130.079 122 128v-56c0-3.314 2.686-6 6-6 3.314 0 6 2.686 6 6ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90 0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6C230 71.667 184.333 26 128 26 71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM229.8 222.46c.851 3.203-1.057 6.489-4.26 7.34-3.203 .851-6.489-1.057-7.34-4.26C215.14 214 204.37 206 192 206c-12.37 0-23.14 8-26.2 19.54-.698 2.63-3.079 4.46-5.8 4.46-.52-.002-1.037-.07-1.54-.2-1.538-.408-2.852-1.411-3.651-2.788-.799-1.377-1.018-3.014-.609-4.552 2.719-10.017 9.408-18.49 18.52-23.46-9.663-8.106-13.224-21.39-8.912-33.243 4.313-11.853 15.579-19.742 28.192-19.742 12.613 0 23.879 7.889 28.192 19.742 4.313 11.853 .752 25.137-8.912 33.243 9.112 4.97 15.801 13.443 18.52 23.46ZM174 176c0 9.941 8.059 18 18 18 9.941 0 18-8.059 18-18 0-9.941-8.059-18-18-18-9.941 0-18 8.059-18 18Z"),
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
        return _clockUser!!
    }

private var _clockUser: ImageVector? = null
