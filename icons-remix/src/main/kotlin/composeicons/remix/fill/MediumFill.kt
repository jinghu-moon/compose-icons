package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MediumFill: ImageVector
    get() {
        if (_mediumFill != null) return _mediumFill!!
        _mediumFill = remixIcon(
            name = "MediumFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.158 3h11.684C19.586 3 21 4.414 21 6.158v3.366c-.081-.005-.163-.008-.245-.008-.403 0-.896 .098-1.248 .275-.4 .185-.753 .462-1.046 .826-.472 .586-.759 1.377-.828 2.266-.015 .177-.02 .354-.017 .531 .047 2.014 1.135 3.624 3.067 3.624 .108 0 .214-.005 .316-.015v.819C21 19.586 19.586 21 17.842 21h-11.684C4.414 21 3 19.586 3 17.842v-11.684C3 4.414 4.414 3 6.158 3ZM21 15.388v-2.726h-1.653c-.074 1.316 .645 2.429 1.653 2.726ZM21 12.281v-2.308c-.08-.022-.166-.034-.257-.035-.814 .017-1.299 .992-1.36 2.343h1.616ZM17.697 7.3l.014-.003v-.11h-2.899l-2.692 6.326L9.43 7.187h-3.124v.11l.014 .003c.529 .119 .798 .298 .798 .94v7.52c0 .642-.27 .82-.799 .94l-.014 .003v.11h2.119v-.11l-.014-.003c-.529-.119-.798-.298-.798-.94v-7.084l3.458 8.137h.196L14.825 8.449v7.496c-.045 .507-.312 .664-.791 .772l-.014 .003v.109h3.692v-.109l-.014-.003c-.48-.108-.752-.265-.798-.772L16.897 8.24h.002c0-.642 .269-.82 .798-.94Z"),
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
        return _mediumFill!!
    }

private var _mediumFill: ImageVector? = null
