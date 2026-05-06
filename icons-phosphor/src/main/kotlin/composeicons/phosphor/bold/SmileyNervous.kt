package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SmileyNervous: ImageVector
    get() {
        if (_smileyNervous != null) return _smileyNervous!!
        _smileyNervous = phosphorBoldIcon(
            name = "SmileyNervous",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 212C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84ZM76 108C76 99.163 83.163 92 92 92c8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM148 108c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM178.92 172.94c-3.938 5.329-11.45 6.457-16.78 2.52-2.976-2.353-5.585-5.137-7.74-8.26-.745-1.043-1.546-2.045-2.4-3-.854 .955-1.655 1.957-2.4 3C146 172 140 180 128 180c-12 0-18-8-21.6-12.8-.745-1.043-1.546-2.045-2.4-3-.854 .955-1.655 1.957-2.4 3-2.155 3.123-4.764 5.907-7.74 8.26-5.33 3.941-12.844 2.815-16.785-2.515-3.941-5.33-2.815-12.844 2.515-16.785 1.042-1.027 1.983-2.152 2.81-3.36C86 148 92 140 104 140c12 0 18 8 21.6 12.8 .745 1.043 1.546 2.045 2.4 3 .854-.955 1.655-1.957 2.4-3C134 148 140 140 152 140c12 0 18 8 21.6 12.8 .827 1.208 1.768 2.333 2.81 3.36 5.325 3.941 6.449 11.453 2.51 16.78Z"),
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
        return _smileyNervous!!
    }

private var _smileyNervous: ImageVector? = null
