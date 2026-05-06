package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Sunglasses: ImageVector
    get() {
        if (_sunglasses != null) return _sunglasses!!
        _sunglasses = phosphorDuotoneIcon(
            name = "Sunglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M32 136h72v28c0 19.882-16.118 36-36 36C48.118 200 32 183.882 32 164ZM152 136v28c0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36v-28Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M200 40c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 8.837 0 16 7.163 16 16v56h-176v-56C40 63.163 47.163 56 56 56c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8C38.327 40 24 54.327 24 72v92c0 24.301 19.699 44 44 44 24.301 0 44-19.699 44-44v-20h32v20c0 24.301 19.699 44 44 44 24.301 0 44-19.699 44-44v-92C232 54.327 217.673 40 200 40ZM212.63 177.31 179.31 144h36.69v20c.007 4.649-1.152 9.225-3.37 13.31ZM40 164v-16.69l41.31 41.32c-8.676 4.688-19.179 4.466-27.649-.584C45.191 182.995 40.001 173.862 40 164ZM96 164c.007 4.649-1.152 9.225-3.37 13.31L59.31 144h36.69ZM160 164v-16.69l41.31 41.32c-8.676 4.688-19.179 4.466-27.649-.584C165.191 182.995 160.001 173.862 160 164Z"),
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
        return _sunglasses!!
    }

private var _sunglasses: ImageVector? = null
