package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Folder: ImageVector
    get() {
        if (_folder != null) return _folder!!
        _folder = phosphorBoldIcon(
            name = "Folder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 68h-82.61l-26-29.29C103.582 34.428 98.12 31.984 92.39 32h-52.39C28.954 32 20 40.954 20 52v148.62c.017 10.696 8.684 19.363 19.38 19.38h177.51c10.55-.011 19.099-8.56 19.11-19.11v-112.89C236 76.954 227.046 68 216 68ZM44 56h46.61l10.67 12h-57.28ZM212 196h-168v-104h168Z"),
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
        return _folder!!
    }

private var _folder: ImageVector? = null
