package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MediumLine: ImageVector
    get() {
        if (_mediumLine != null) return _mediumLine!!
        _mediumLine = remixIcon(
            name = "MediumLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.158 4h11.684c1.192 0 2.158 .966 2.158 2.158v3.455c-.177 .045-.347 .104-.492 .177-.4 .185-.753 .462-1.046 .826-.473 .586-.759 1.377-.828 2.266-.015 .177-.02 .354-.017 .531 .041 1.763 .879 3.216 2.384 3.551v.877c0 1.192-.966 2.158-2.158 2.158h-11.684C4.966 20 4 19.034 4 17.842v-11.684C4 4.966 4.966 4 6.158 4ZM21 6.158C21 4.414 19.586 3 17.842 3h-11.684C4.414 3 3 4.414 3 6.158v11.684C3 19.586 4.414 21 6.158 21h11.684c1.744 0 3.158-1.414 3.158-3.158v-11.684ZM20 10.298v1.983h-.616c.039-.867 .253-1.58 .616-1.983ZM20 12.662v2.063c-.441-.513-.699-1.249-.653-2.063h.653ZM17.697 7.3l.014-.003v-.11h-2.899l-2.692 6.326L9.43 7.187h-3.124v.11l.014 .003c.529 .119 .798 .298 .798 .94v7.52c0 .642-.27 .82-.799 .94l-.014 .003v.11h2.119v-.11l-.014-.003c-.529-.119-.798-.298-.798-.94v-7.084l3.458 8.137h.196L14.825 8.449v7.496c-.045 .507-.312 .664-.791 .772l-.014 .003v.109h3.692v-.109l-.014-.003c-.48-.108-.752-.265-.797-.772L16.897 8.24h.003c0-.642 .269-.82 .797-.94Z"),
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
        return _mediumLine!!
    }

private var _mediumLine: ImageVector? = null
