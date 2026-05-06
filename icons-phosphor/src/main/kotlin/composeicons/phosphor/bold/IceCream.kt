package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.IceCream: ImageVector
    get() {
        if (_iceCream != null) return _iceCream!!
        _iceCream = phosphorBoldIcon(
            name = "IceCream",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 116c-.031-11.576-6.284-22.24-16.37-27.92C207.567 44.93 171.341 11.955 128 11.955c-43.341 0-79.567 32.974-83.63 76.125C32.169 94.91 25.815 108.872 28.68 122.558c2.865 13.686 14.284 23.928 28.2 25.292l53.75 94.07c3.559 6.237 10.189 10.086 17.37 10.086 7.181 0 13.811-3.85 17.37-10.086l53.75-94.07C215.507 146.245 228.001 132.466 228 116ZM58.39 108.16c5.592-1.137 9.61-6.054 9.61-11.76v-.4C68 62.863 94.863 36 128 36c33.137 0 60 26.863 60 60v.4c-0 5.706 4.018 10.623 9.61 11.76 4.03 .818 6.783 4.558 6.367 8.649-.416 4.091-3.865 7.2-7.977 7.191h-136c-4.112 .009-7.561-3.1-7.977-7.191-.416-4.091 2.337-7.831 6.367-8.649ZM171.39 148l-16.5 28.88L138.39 148ZM84.61 148h26.14l30.32 53.06L128 223.94Z"),
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
        return _iceCream!!
    }

private var _iceCream: ImageVector? = null
