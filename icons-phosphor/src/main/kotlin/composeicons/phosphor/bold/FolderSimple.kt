package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FolderSimple: ImageVector
    get() {
        if (_folderSimple != null) return _folderSimple!!
        _folderSimple = phosphorBoldIcon(
            name = "FolderSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 68h-84L105.33 48c-3.466-2.589-7.674-3.991-12-4h-53.33C28.954 44 20 52.954 20 64v136c0 11.046 8.954 20 20 20h176.89c10.55-.011 19.099-8.56 19.11-19.11v-112.89C236 76.954 227.046 68 216 68ZM212 196h-168v-128h48l28.8 21.6C122.877 91.158 125.404 92 128 92h84Z"),
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
        return _folderSimple!!
    }

private var _folderSimple: ImageVector? = null
