package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TreeStructure: ImageVector
    get() {
        if (_treeStructure != null) return _treeStructure!!
        _treeStructure = phosphorLightIcon(
            name = "TreeStructure",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 160.000 110.000 L 208.000 110.000 C 215.732 110.000 222.000 103.732 222.000 96.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 L 160.000 34.000 C 152.268 34.000 146.000 40.268 146.000 48.000 L 146.000 66.000 L 128.000 66.000 C 115.850 66.000 106.000 75.850 106.000 88.000 L 106.000 122.000 L 70.000 122.000 L 70.000 112.000 C 70.000 104.268 63.732 98.000 56.000 98.000 L 24.000 98.000 C 16.268 98.000 10.000 104.268 10.000 112.000 L 10.000 144.000 C 10.000 151.732 16.268 158.000 24.000 158.000 L 56.000 158.000 C 63.732 158.000 70.000 151.732 70.000 144.000 L 70.000 134.000 L 106.000 134.000 L 106.000 168.000 C 106.000 180.150 115.850 190.000 128.000 190.000 L 146.000 190.000 L 146.000 208.000 C 146.000 215.732 152.268 222.000 160.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 160.000 C 222.000 152.268 215.732 146.000 208.000 146.000 L 160.000 146.000 C 152.268 146.000 146.000 152.268 146.000 160.000 L 146.000 178.000 L 128.000 178.000 C 122.477 178.000 118.000 173.523 118.000 168.000 L 118.000 88.000 C 118.000 82.477 122.477 78.000 128.000 78.000 L 146.000 78.000 L 146.000 96.000 C 146.000 103.732 152.268 110.000 160.000 110.000 ZM 58.000 144.000 C 58.000 145.105 57.105 146.000 56.000 146.000 L 24.000 146.000 C 22.895 146.000 22.000 145.105 22.000 144.000 L 22.000 112.000 C 22.000 110.895 22.895 110.000 24.000 110.000 L 56.000 110.000 C 57.105 110.000 58.000 110.895 58.000 112.000 ZM 158.000 160.000 C 158.000 158.895 158.895 158.000 160.000 158.000 L 208.000 158.000 C 209.105 158.000 210.000 158.895 210.000 160.000 L 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 160.000 210.000 C 158.895 210.000 158.000 209.105 158.000 208.000 ZM 158.000 48.000 C 158.000 46.895 158.895 46.000 160.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 L 210.000 96.000 C 210.000 97.105 209.105 98.000 208.000 98.000 L 160.000 98.000 C 158.895 98.000 158.000 97.105 158.000 96.000 Z"),
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
        return _treeStructure!!
    }

private var _treeStructure: ImageVector? = null
