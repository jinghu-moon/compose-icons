package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MicrosoftWordLogo: ImageVector
    get() {
        if (_microsoftWordLogo != null) return _microsoftWordLogo!!
        _microsoftWordLogo = phosphorBoldIcon(
            name = "MicrosoftWordLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 20h-128C60.954 20 52 28.954 52 40v16h-16C24.954 56 16 64.954 16 76v104c0 11.046 8.954 20 20 20h16v16c0 11.046 8.954 20 20 20h128c11.046 0 20-8.954 20-20v-176C220 28.954 211.046 20 200 20ZM168 108h28v40h-28ZM76 44h120v40h-28v-8C168 64.954 159.046 56 148 56h-72ZM40 80h104v96h-104ZM76 212v-12h72c11.046 0 20-8.954 20-20v-8h28v40ZM64.36 154.91l-12-48c-1.124-4.188 .1-8.657 3.2-11.689 3.1-3.032 7.595-4.156 11.757-2.939 4.162 1.216 7.344 4.584 8.324 8.808l4.13 16.53 1.5-3c2.034-4.062 6.187-6.627 10.73-6.627 4.543 0 8.696 2.565 10.73 6.627l1.5 3 4.13-16.53c1.697-6.324 8.149-10.12 14.501-8.532 6.352 1.588 10.258 7.974 8.779 14.352l-12 48c-1.224 4.864-5.344 8.454-10.33 9-.435 .055-.872 .085-1.31 .09-4.543-.001-8.697-2.567-10.73-6.63L92 146.83l-5.27 10.54c-2.248 4.488-7.052 7.102-12.041 6.554-4.989-.549-9.11-4.145-10.329-9.014Z"),
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
        return _microsoftWordLogo!!
    }

private var _microsoftWordLogo: ImageVector? = null
