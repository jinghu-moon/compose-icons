package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Export: ImageVector
    get() {
        if (_export != null) return _export!!
        _export = phosphorLightIcon(
            name = "Export",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(214.0f, 112.0f),
                    PathNode.LineTo(214.0f, 208.0f),
                    PathNode.CurveTo(214.0f, 215.73198f, 207.73198f, 222.0f, 200.0f, 222.0f),
                    PathNode.LineTo(56.0f, 222.0f),
                    PathNode.CurveTo(48.268013f, 222.0f, 42.0f, 215.73198f, 42.0f, 208.0f),
                    PathNode.LineTo(42.0f, 112.0f),
                    PathNode.CurveTo(42.0f, 104.26801f, 48.268013f, 98.0f, 56.0f, 98.0f),
                    PathNode.LineTo(80.0f, 98.0f),
                    PathNode.CurveTo(83.313705f, 98.0f, 86.0f, 100.686295f, 86.0f, 104.0f),
                    PathNode.CurveTo(86.0f, 107.313705f, 83.313705f, 110.0f, 80.0f, 110.0f),
                    PathNode.LineTo(56.0f, 110.0f),
                    PathNode.CurveTo(54.89543f, 110.0f, 54.0f, 110.89543f, 54.0f, 112.0f),
                    PathNode.LineTo(54.0f, 208.0f),
                    PathNode.CurveTo(54.0f, 209.10457f, 54.89543f, 210.0f, 56.0f, 210.0f),
                    PathNode.LineTo(200.0f, 210.0f),
                    PathNode.CurveTo(201.10457f, 210.0f, 202.0f, 209.10457f, 202.0f, 208.0f),
                    PathNode.LineTo(202.0f, 112.0f),
                    PathNode.CurveTo(202.0f, 110.89543f, 201.10457f, 110.0f, 200.0f, 110.0f),
                    PathNode.LineTo(176.0f, 110.0f),
                    PathNode.CurveTo(172.6863f, 110.0f, 170.0f, 107.313705f, 170.0f, 104.0f),
                    PathNode.CurveTo(170.0f, 100.686295f, 172.6863f, 98.0f, 176.0f, 98.0f),
                    PathNode.LineTo(200.0f, 98.0f),
                    PathNode.CurveTo(207.73198f, 98.0f, 214.0f, 104.26801f, 214.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.24f, 68.24f),
                    PathNode.LineTo(122.0f, 38.49f),
                    PathNode.LineTo(122.0f, 136.0f),
                    PathNode.CurveTo(122.0f, 139.3137f, 124.686295f, 142.0f, 128.0f, 142.0f),
                    PathNode.CurveTo(131.3137f, 142.0f, 134.0f, 139.3137f, 134.0f, 136.0f),
                    PathNode.LineTo(134.0f, 38.49f),
                    PathNode.LineTo(163.76f, 68.24f),
                    PathNode.CurveTo(165.25575f, 69.84522f, 167.50844f, 70.506f, 169.63431f, 69.96308f),
                    PathNode.CurveTo(171.76018f, 69.42017f, 173.42018f, 67.76018f, 173.96309f, 65.63431f),
                    PathNode.CurveTo(174.506f, 63.508446f, 173.84523f, 61.255764f, 172.24f, 59.76f),
                    PathNode.LineTo(132.24f, 19.76f),
                    PathNode.CurveTo(129.89746f, 17.420374f, 126.10254f, 17.420374f, 123.76f, 19.76f),
                    PathNode.LineTo(83.76f, 59.76f),
                    PathNode.CurveTo(82.15478f, 61.255764f, 81.494f, 63.508446f, 82.03692f, 65.63431f),
                    PathNode.CurveTo(82.57983f, 67.76018f, 84.23982f, 69.42017f, 86.3657f, 69.96308f),
                    PathNode.CurveTo(88.491554f, 70.506f, 90.74423f, 69.84522f, 92.24f, 68.24f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _export!!
    }

private var _export: ImageVector? = null
