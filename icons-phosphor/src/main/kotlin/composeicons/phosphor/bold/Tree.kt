package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tree: ImageVector
    get() {
        if (_tree != null) return _tree!!
        _tree = phosphorBoldIcon(
            name = "Tree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M201.17 59.62C188.364 30.651 159.673 11.964 128 11.964c-31.673 0-60.364 18.687-73.17 47.656C18.281 77.584 2.388 121.164 18.792 158.439c16.404 37.275 59.274 54.995 97.208 40.181v33.38c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-33.36c8.913 3.531 18.413 5.349 28 5.36h1.92c35.067-.864 64.988-25.615 72.409-59.9 7.421-34.284-9.587-69.193-41.159-84.48ZM169.35 180c-10.384 .256-20.606-2.603-29.35-8.21v-36.37l41.37-20.69c3.899-1.881 6.482-5.716 6.761-10.035 .279-4.32-1.791-8.455-5.415-10.821-3.625-2.366-8.243-2.597-12.085-.604L140 108.58v-20.58c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v44.58L85.37 117.27c-5.908-2.85-13.01-.429-15.946 5.437-2.936 5.866-.617 13.002 5.206 16.023L116 159.42v12.37c-8.75 5.593-18.968 8.451-29.35 8.21C59.12 179.31 35.93 155.44 36 127.87 36.009 106.676 48.925 87.624 68.61 79.77c3.148-1.269 5.612-3.813 6.78-7C83.452 50.666 104.471 35.958 128 35.958c23.529 0 44.548 14.707 52.61 36.812 1.168 3.187 3.632 5.731 6.78 7 19.678 7.851 32.593 26.893 32.61 48.08 .08 27.56-23.12 51.44-50.65 52.15Z"),
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
        return _tree!!
    }

private var _tree: ImageVector? = null
