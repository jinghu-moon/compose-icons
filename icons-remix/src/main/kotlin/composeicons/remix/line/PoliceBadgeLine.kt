package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PoliceBadgeLine: ImageVector
    get() {
        if (_policeBadgeLine != null) return _policeBadgeLine!!
        _policeBadgeLine = remixIcon(
            name = "PoliceBadgeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.475 4.935c.506-.025 .962-.09 1.351-.168l1.732 1.98c-.39 .82-.613 1.602-.695 2.377-.124 1.158 .089 2.144 .245 2.864l.007 .033c.162 .744 .268 1.234 .253 1.809-.015 .542-.147 1.257-.657 2.277-1.101 2.201-3.695 2.666-5.715 3.676-.326 .163-.663 .349-.996 .568-.333-.219-.67-.405-.996-.568C8.984 18.772 6.39 18.307 5.289 16.105 4.779 15.085 4.647 14.37 4.632 13.829c-.016-.575 .091-1.064 .253-1.809l.007-.033c.156-.72 .369-1.706 .245-2.864C5.054 8.349 4.832 7.566 4.442 6.747L6.174 4.767c.389 .078 .846 .143 1.351 .168C8.79 4.998 10.402 4.81 12 3.918c1.598 .892 3.21 1.08 4.475 1.017ZM21.087 11.674C20.764 10.195 20.461 8.808 22 6.5l-3.5-4C18.5 2.5 15 4 12 1.5 9 4 5.5 2.5 5.5 2.5L2 6.5c1.539 2.308 1.236 3.695 .913 5.174-.306 1.404-.631 2.891 .587 5.326 1.577 3.154 4.708 3.51 6.943 4.745 .6 .331 1.134 .726 1.558 1.255 .423-.529 .958-.923 1.557-1.255C15.792 20.51 18.923 20.154 20.5 17c1.218-2.436 .893-3.922 .587-5.326ZM14.378 12.773l.561 3.273L12 14.5 9.061 16.045l.561-3.273L7.245 10.455l3.286-.477L12 7l1.47 2.977 3.286 .477-2.378 2.318Z"),
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
        return _policeBadgeLine!!
    }

private var _policeBadgeLine: ImageVector? = null
