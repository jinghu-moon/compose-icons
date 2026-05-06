package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Funnel: ImageVector
    get() {
        if (_funnel != null) return _funnel!!
        _funnel = lucideOutlineIcon(
            name = "Funnel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10 20c-0 .379 .214 .726 .553 .895l2 1c.31 .155 .678 .138 .973-.044 .295-.182 .474-.504 .474-.851v-7c0-.496 .184-.973 .517-1.341L21.74 4.67c.264-.293 .332-.714 .172-1.075C21.752 3.234 21.395 3.001 21 3h-18c-.395 0-.753 .233-.913 .594-.16 .361-.093 .783 .171 1.076l7.225 7.989c.333 .368 .517 .845 .517 1.341Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _funnel!!
    }

private var _funnel: ImageVector? = null
