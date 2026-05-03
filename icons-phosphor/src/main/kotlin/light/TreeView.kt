package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TreeView: ImageVector
    get() {
        if (_treeView != null) return _treeView!!
        _treeView = phosphorLightIcon(
            name = "TreeView",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 176.000 150.000 L 208.000 150.000 C 215.732 150.000 222.000 143.732 222.000 136.000 L 222.000 104.000 C 222.000 96.268 215.732 90.000 208.000 90.000 L 176.000 90.000 C 168.268 90.000 162.000 96.268 162.000 104.000 L 162.000 114.000 L 86.000 114.000 L 86.000 78.000 L 96.000 78.000 C 103.732 78.000 110.000 71.732 110.000 64.000 L 110.000 32.000 C 110.000 24.268 103.732 18.000 96.000 18.000 L 64.000 18.000 C 56.268 18.000 50.000 24.268 50.000 32.000 L 50.000 64.000 C 50.000 71.732 56.268 78.000 64.000 78.000 L 74.000 78.000 L 74.000 192.000 C 74.000 204.150 83.850 214.000 96.000 214.000 L 162.000 214.000 L 162.000 224.000 C 162.000 231.732 168.268 238.000 176.000 238.000 L 208.000 238.000 C 215.732 238.000 222.000 231.732 222.000 224.000 L 222.000 192.000 C 222.000 184.268 215.732 178.000 208.000 178.000 L 176.000 178.000 C 168.268 178.000 162.000 184.268 162.000 192.000 L 162.000 202.000 L 96.000 202.000 C 90.477 202.000 86.000 197.523 86.000 192.000 L 86.000 126.000 L 162.000 126.000 L 162.000 136.000 C 162.000 143.732 168.268 150.000 176.000 150.000 ZM 62.000 64.000 L 62.000 32.000 C 62.000 30.895 62.895 30.000 64.000 30.000 L 96.000 30.000 C 97.105 30.000 98.000 30.895 98.000 32.000 L 98.000 64.000 C 98.000 65.105 97.105 66.000 96.000 66.000 L 64.000 66.000 C 62.895 66.000 62.000 65.105 62.000 64.000 ZM 174.000 192.000 C 174.000 190.895 174.895 190.000 176.000 190.000 L 208.000 190.000 C 209.105 190.000 210.000 190.895 210.000 192.000 L 210.000 224.000 C 210.000 225.105 209.105 226.000 208.000 226.000 L 176.000 226.000 C 174.895 226.000 174.000 225.105 174.000 224.000 ZM 174.000 104.000 C 174.000 102.895 174.895 102.000 176.000 102.000 L 208.000 102.000 C 209.105 102.000 210.000 102.895 210.000 104.000 L 210.000 136.000 C 210.000 137.105 209.105 138.000 208.000 138.000 L 176.000 138.000 C 174.895 138.000 174.000 137.105 174.000 136.000 Z"),
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
        return _treeView!!
    }

private var _treeView: ImageVector? = null
