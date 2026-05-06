package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MicrosoftExcelLogo: ImageVector
    get() {
        if (_microsoftExcelLogo != null) return _microsoftExcelLogo!!
        _microsoftExcelLogo = phosphorThinIcon(
            name = "MicrosoftExcelLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 28h-128C65.373 28 60 33.373 60 40v28h-20C33.373 68 28 73.373 28 80v96c0 6.627 5.373 12 12 12h20v28c0 6.627 5.373 12 12 12h128c6.627 0 12-5.373 12-12v-176c0-6.627-5.373-12-12-12ZM156 100h48v56h-48ZM204 40v52h-48v-12c0-6.627-5.373-12-12-12h-4v-32h60c2.209 0 4 1.791 4 4ZM68 40c0-2.209 1.791-4 4-4h60v32h-64ZM36 176v-96c0-2.209 1.791-4 4-4h104c2.209 0 4 1.791 4 4v96c0 2.209-1.791 4-4 4h-104c-2.209 0-4-1.791-4-4ZM68 216v-28h64v32h-60c-2.209 0-4-1.791-4-4ZM200 220h-60v-32h4c6.627 0 12-5.373 12-12v-12h48v52c0 2.209-1.791 4-4 4ZM68.93 149.44 86.79 128 68.93 106.56c-1.317-1.702-1.051-4.141 .602-5.519 1.653-1.378 4.1-1.202 5.538 .399L92 121.75l16.93-20.31c.896-1.158 2.353-1.734 3.798-1.502 1.446 .232 2.649 1.235 3.137 2.616 .488 1.38 .183 2.917-.795 4.006L97.21 128l17.86 21.44c.978 1.089 1.283 2.626 .795 4.006-.488 1.38-1.691 2.384-3.137 2.616-1.446 .232-2.902-.344-3.798-1.502L92 134.25 75.07 154.56c-.759 .911-1.884 1.439-3.07 1.44-.937 .004-1.844-.326-2.56-.93-1.694-1.415-1.922-3.934-.51-5.63Z"),
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
