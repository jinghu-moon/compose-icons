package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CompassRose: ImageVector
    get() {
        if (_compassRose != null) return _compassRose!!
        _compassRose = phosphorBoldIcon(
            name = "CompassRose",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M247 116.39l-20.47-5.34C219.289 69.372 186.671 36.722 145 29.44L139.61 9C138.23 3.719 133.459 .034 128 .034 122.541 .034 117.77 3.719 116.39 9l-5.34 20.47C69.348 36.721 36.691 69.378 29.44 111.08L9 116.39C3.719 117.77 .034 122.541 .034 128c0 5.459 3.684 10.23 8.966 11.61L29.44 145c7.251 41.702 39.908 74.359 81.61 81.61L116.39 247c1.38 5.281 6.151 8.966 11.61 8.966 5.459 0 10.23-3.684 11.61-8.966L145 226.56c41.667-7.264 74.296-39.893 81.56-81.56L247 139.61c5.281-1.38 8.966-6.151 8.966-11.61 0-5.459-3.684-10.23-8.966-11.61ZM200.12 104.16l-38.31-10-10-38.31c22.826 7.586 40.74 25.489 48.34 48.31ZM117.32 100.38 128 59.54l10.65 40.84L128 111ZM128 145l10.65 10.65L128 196.46 117.35 155.62ZM100.38 117.38 111 128l-10.65 10.65L59.54 128ZM155.62 138.68 145 128l10.65-10.65L196.46 128ZM104.16 55.88l-10 38.31-38.31 10C63.436 81.364 81.339 63.45 104.16 55.85ZM55.85 151.88l38.31 10 10 38.31C81.337 192.588 63.433 174.67 55.85 151.84ZM151.85 200.19l10-38.31 38.31-10c-7.607 22.801-25.511 40.687-48.32 48.27Z"),
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
        return _compassRose!!
    }

private var _compassRose: ImageVector? = null
