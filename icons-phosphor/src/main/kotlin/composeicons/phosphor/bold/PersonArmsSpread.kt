package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonArmsSpread: ImageVector
    get() {
        if (_personArmsSpread != null) return _personArmsSpread!!
        _personArmsSpread = phosphorBoldIcon(
            name = "PersonArmsSpread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M235.4 86.85C233.142 75.76 223.316 67.845 212 68h-61.41c11.886-9.579 16.438-25.612 11.359-40.008C156.87 13.597 143.265 3.97 128 3.97c-15.265 0-28.87 9.627-33.949 24.023C88.972 42.388 93.524 58.421 105.41 68h-61.41C32.741 68.028 23.014 75.879 20.612 86.879 18.21 97.879 23.777 109.071 34 113.79l.19 .09 47.63 21L61.76 211c-4.781 11.837 .54 25.345 12.11 30.74 3.169 1.49 6.628 2.262 10.13 2.26 9.115 .016 17.452-5.133 21.52-13.29L128 191.91l22.51 38.8c5.739 11.561 19.592 16.513 31.359 11.209 11.767-5.303 17.232-18.963 12.371-30.919l-20-76.15 47.63-21 .19-.09c10.332-4.603 15.933-15.9 13.34-26.91ZM128 28c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM155.16 117c-5.384 2.375-8.251 8.305-6.77 14l22.87 87c.183 .687 .427 1.357 .73 2-.15-.32-.32-.64-.5-.95L138.38 162c-2.147-3.701-6.102-5.979-10.38-5.979-4.278 0-8.233 2.278-10.38 5.979L84.51 219.05c-.18 .31-.35 .63-.5 .95 .303-.643 .547-1.313 .73-2l22.87-86.92c1.481-5.695-1.386-11.625-6.77-14L44 92h168Z"),
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
        return _personArmsSpread!!
    }

private var _personArmsSpread: ImageVector? = null
