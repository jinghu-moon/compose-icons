package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MedalMilitary: ImageVector
    get() {
        if (_medalMilitary != null) return _medalMilitary!!
        _medalMilitary = phosphorRegularIcon(
            name = "MedalMilitary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M207 40h-158C39.611 40 32 47.611 32 57v49.21c.009 6.672 3.92 12.723 10 15.47l62.6 28.45C85.537 160.798 76.081 182.991 81.593 204.129c5.512 21.138 24.602 35.888 46.447 35.888 21.845 0 40.935-14.75 46.447-35.888 5.512-21.138-3.944-43.332-23.007-53.999L214 121.68c6.08-2.747 9.991-8.798 10-15.47v-49.21c0-9.389-7.611-17-17-17ZM160 56v72.67l-32 14.54L96 128.67v-72.67ZM48 106.21v-49.21c0-.552 .448-1 1-1h31v65.39L48.59 107.12c-.358-.161-.589-.517-.59-.91ZM128 224C110.327 224 96 209.673 96 192c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32 0 17.673-14.327 32-32 32ZM208 106.21c-.001 .393-.232 .749-.59 .91L176 121.39v-65.39h31c.552 0 1 .448 1 1Z"),
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
        return _medalMilitary!!
    }

private var _medalMilitary: ImageVector? = null
