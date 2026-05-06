package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MicrosoftExcelLogo: ImageVector
    get() {
        if (_microsoftExcelLogo != null) return _microsoftExcelLogo!!
        _microsoftExcelLogo = phosphorBoldIcon(
            name = "MicrosoftExcelLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 20h-128C60.954 20 52 28.954 52 40v16h-16C24.954 56 16 64.954 16 76v104c0 11.046 8.954 20 20 20h16v16c0 11.046 8.954 20 20 20h128c11.046 0 20-8.954 20-20v-176C220 28.954 211.046 20 200 20ZM168 108h28v40h-28ZM196 84h-28v-8C168 64.954 159.046 56 148 56v-12h48ZM76 44h48v12h-48ZM40 80h104v96h-104ZM76 200h48v12h-48ZM148 212v-12c11.046 0 20-8.954 20-20v-8h28v40ZM64.32 161.22c-5.092-4.242-5.781-11.808-1.54-16.9L76.38 128 62.78 111.68c-2.785-3.289-3.592-7.82-2.114-11.869 1.478-4.049 5.014-6.994 9.263-7.716 4.249-.722 8.559 .891 11.291 4.224L92 109.25 102.78 96.32c4.258-5.03 11.775-5.684 16.839-1.467 5.063 4.218 5.778 11.73 1.601 16.827L107.62 128l13.6 16.32c2.785 3.289 3.592 7.82 2.114 11.869-1.478 4.049-5.014 6.994-9.263 7.716-4.249 .722-8.559-.891-11.291-4.224L92 146.75 81.22 159.68c-4.242 5.092-11.808 5.781-16.9 1.54Z"),
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
        return _microsoftExcelLogo!!
    }

private var _microsoftExcelLogo: ImageVector? = null
