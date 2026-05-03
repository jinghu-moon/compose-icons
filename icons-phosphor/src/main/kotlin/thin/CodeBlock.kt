package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CodeBlock: ImageVector
    get() {
        if (_codeBlock != null) return _codeBlock!!
        _codeBlock = phosphorThinIcon(
            name = "CodeBlock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 61.170 98.830 L 29.170 66.830 C 28.419 66.080 27.997 65.062 27.997 64.000 C 27.997 62.938 28.419 61.920 29.170 61.170 L 61.170 29.170 C 62.733 27.607 65.267 27.607 66.830 29.170 C 68.393 30.733 68.393 33.267 66.830 34.830 L 37.660 64.000 L 66.830 93.170 C 68.393 94.733 68.393 97.267 66.830 98.830 C 65.267 100.393 62.733 100.393 61.170 98.830 ZM 101.170 98.830 C 101.920 99.581 102.938 100.003 104.000 100.003 C 105.062 100.003 106.080 99.581 106.830 98.830 L 138.830 66.830 C 139.581 66.080 140.003 65.062 140.003 64.000 C 140.003 62.938 139.581 61.920 138.830 61.170 L 106.830 29.170 C 105.267 27.607 102.733 27.607 101.170 29.170 C 99.607 30.733 99.607 33.267 101.170 34.830 L 130.340 64.000 L 101.170 93.170 C 100.419 93.920 99.997 94.938 99.997 96.000 C 99.997 97.062 100.419 98.080 101.170 98.830 ZM 200.000 44.000 L 176.000 44.000 C 173.791 44.000 172.000 45.791 172.000 48.000 C 172.000 50.209 173.791 52.000 176.000 52.000 L 200.000 52.000 C 202.209 52.000 204.000 53.791 204.000 56.000 L 204.000 200.000 C 204.000 202.209 202.209 204.000 200.000 204.000 L 56.000 204.000 C 53.791 204.000 52.000 202.209 52.000 200.000 L 52.000 136.000 C 52.000 133.791 50.209 132.000 48.000 132.000 C 45.791 132.000 44.000 133.791 44.000 136.000 L 44.000 200.000 C 44.000 206.627 49.373 212.000 56.000 212.000 L 200.000 212.000 C 206.627 212.000 212.000 206.627 212.000 200.000 L 212.000 56.000 C 212.000 49.373 206.627 44.000 200.000 44.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _codeBlock!!
    }

private var _codeBlock: ImageVector? = null
