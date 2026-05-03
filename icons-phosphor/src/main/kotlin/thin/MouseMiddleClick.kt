package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MouseMiddleClick: ImageVector
    get() {
        if (_mouseMiddleClick != null) return _mouseMiddleClick!!
        _mouseMiddleClick = phosphorThinIcon(
            name = "MouseMiddleClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 144.000 20.000 L 112.000 20.000 C 78.879 20.039 52.039 46.879 52.000 80.000 L 52.000 176.000 C 52.039 209.121 78.879 235.961 112.000 236.000 L 144.000 236.000 C 177.121 235.961 203.961 209.121 204.000 176.000 L 204.000 80.000 C 203.961 46.879 177.121 20.039 144.000 20.000 ZM 196.000 80.000 L 196.000 108.000 L 148.000 108.000 L 148.000 88.000 C 148.000 81.373 142.627 76.000 136.000 76.000 L 132.000 76.000 L 132.000 28.000 L 144.000 28.000 C 172.705 28.033 195.967 51.295 196.000 80.000 ZM 116.000 88.000 C 116.000 85.791 117.791 84.000 120.000 84.000 L 136.000 84.000 C 138.209 84.000 140.000 85.791 140.000 88.000 L 140.000 136.000 C 140.000 138.209 138.209 140.000 136.000 140.000 L 120.000 140.000 C 117.791 140.000 116.000 138.209 116.000 136.000 ZM 112.000 28.000 L 124.000 28.000 L 124.000 76.000 L 120.000 76.000 C 113.373 76.000 108.000 81.373 108.000 88.000 L 108.000 108.000 L 60.000 108.000 L 60.000 80.000 C 60.033 51.295 83.295 28.033 112.000 28.000 ZM 144.000 228.000 L 112.000 228.000 C 83.295 227.967 60.033 204.705 60.000 176.000 L 60.000 116.000 L 108.000 116.000 L 108.000 136.000 C 108.000 142.627 113.373 148.000 120.000 148.000 L 136.000 148.000 C 142.627 148.000 148.000 142.627 148.000 136.000 L 148.000 116.000 L 196.000 116.000 L 196.000 176.000 C 195.967 204.705 172.705 227.967 144.000 228.000 Z"),
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
        return _mouseMiddleClick!!
    }

private var _mouseMiddleClick: ImageVector? = null
