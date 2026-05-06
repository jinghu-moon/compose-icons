package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GitlabLogoSimple: ImageVector
    get() {
        if (_gitlabLogoSimple != null) return _gitlabLogoSimple!!
        _gitlabLogoSimple = phosphorFillIcon(
            name = "GitlabLogoSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208.14 178.06l-73.27 51.76c-4.118 2.908-9.622 2.908-13.74 0L47.86 178.06c-19.266-13.809-28.017-38.072-22-61L45.75 41c1.3-5.073 5.754-8.708 10.986-8.962 5.231-.255 10.018 2.929 11.804 7.852L86.22 88h83.56L187.46 39.87c1.791-4.922 6.58-8.103 11.812-7.844 5.232 .259 9.683 3.898 10.978 8.974l19.9 76.12c5.988 22.911-2.764 47.143-22.01 60.94Z"),
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
        return _gitlabLogoSimple!!
    }

private var _gitlabLogoSimple: ImageVector? = null
