package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HeartBreak: ImageVector
    get() {
        if (_heartBreak != null) return _heartBreak!!
        _heartBreak = phosphorBoldIcon(
            name = "HeartBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M178 36c-17.513-.045-34.317 6.915-46.67 19.33L128 58.66l-3.33-3.33C105.794 36.453 77.406 30.806 52.743 41.022 28.08 51.238 11.999 75.305 12 102c0 72.34 105.81 130.14 110.31 132.57 3.552 1.913 7.828 1.913 11.38 0C138.19 232.14 244 174.34 244 102 243.956 65.567 214.433 36.044 178 36ZM172.51 178.36C158.583 190.178 143.694 200.815 128 210.16 112.306 200.815 97.417 190.178 83.49 178.36 61.82 159.77 36 131.42 36 102 35.999 85.012 46.232 69.696 61.927 63.194c15.695-6.501 33.761-2.907 45.773 9.106L111 75.63l-7.52 7.52c-2.259 2.252-3.529 5.31-3.529 8.5 0 3.19 1.27 6.248 3.529 8.5l21.7 21.7-13.7 13.69c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0l22.18-22.19c2.259-2.252 3.529-5.31 3.529-8.5 0-3.19-1.27-6.248-3.529-8.5L129 91.63 148.3 72.3c12.012-12.013 30.078-15.607 45.773-9.106C209.768 69.696 220.001 85.012 220 102c0 29.42-25.82 57.77-47.49 76.36Z"),
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
        return _heartBreak!!
    }

private var _heartBreak: ImageVector? = null
