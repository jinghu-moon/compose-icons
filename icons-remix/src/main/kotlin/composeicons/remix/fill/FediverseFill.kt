package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FediverseFill: ImageVector
    get() {
        if (_fediverseFill != null) return _fediverseFill!!
        _fediverseFill = remixIcon(
            name = "FediverseFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.268 1.555v.616l.253 4.015L8.169 3.959 7.636 3.651 6.903 4.92l.533 .308 3.603 1.789L7.437 8.806l-.533 .308 .733 1.269 .533-.308L11.521 7.848l-.253 4.016v.615h1.465v-.615L12.48 7.848l3.351 2.227 .533 .308 .733-1.269-.533-.308L12.96 7.017 16.564 5.228l.533-.308L16.364 3.651l-.533 .308L12.48 6.186l.253-4.015v-.616h-1.465ZM5.972 10.727v.615l.253 4.016L2.874 13.131l-.533-.308-.732 1.27 .533 .308 3.605 1.789L2.141 17.978l-.533 .308 .732 1.269 .533-.308L6.225 17.02l-.253 4.015v.616h1.465v-.616L7.185 17.02l3.351 2.227 .533 .308 .733-1.269-.533-.308L7.665 16.188l3.604-1.789 .533-.308-.733-1.27-.533 .308L7.185 15.357l.252-4.016v-.615h-1.465ZM16.562 10.727v.615l.253 4.016L13.464 13.131l-.533-.308-.733 1.27 .533 .308 3.604 1.789-3.604 1.789-.533 .308 .733 1.269 .533-.308 3.351-2.227-.253 4.015v.616h1.466v-.616l-.253-4.016 3.351 2.227 .533 .308 .733-1.269-.533-.308L18.255 16.188l3.604-1.789 .533-.308-.733-1.27-.533 .308-3.351 2.226 .253-4.016v-.615h-1.466Z"),
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
        return _fediverseFill!!
    }

private var _fediverseFill: ImageVector? = null
