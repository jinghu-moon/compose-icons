package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserCheck: ImageVector
    get() {
        if (_userCheck != null) return _userCheck!!
        _userCheck = phosphorLightIcon(
            name = "UserCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(139.0f, 158.25f),
                    PathNode.CurveTo(165.74763f, 144.01926f, 179.37091f, 113.405136f, 172.03748f, 84.008354f),
                    PathNode.CurveTo(164.70404f, 54.61157f, 138.29768f, 33.98337f, 108.0f, 33.98337f),
                    PathNode.CurveTo(77.70231f, 33.98337f, 51.295948f, 54.61157f, 43.96252f, 84.008354f),
                    PathNode.CurveTo(36.629093f, 113.405136f, 50.25236f, 144.01926f, 77.0f, 158.25f),
                    PathNode.CurveTo(55.0f, 164.48f, 35.12f, 177.41f, 19.39f, 196.14f),
                    PathNode.CurveTo(17.377563f, 198.68399f, 17.751375f, 202.36678f, 20.23394f, 204.45451f),
                    PathNode.CurveTo(22.716505f, 206.54225f, 26.40884f, 206.27892f, 28.57f, 203.86f),
                    PathNode.CurveTo(49.11f, 179.44f, 77.31f, 166.0f, 108.0f, 166.0f),
                    PathNode.CurveTo(138.69f, 166.0f, 166.9f, 179.44f, 187.41f, 203.86f),
                    PathNode.CurveTo(188.7665f, 205.5748f, 190.94841f, 206.41594f, 193.10495f, 206.05544f),
                    PathNode.CurveTo(195.26149f, 205.69493f, 197.0512f, 204.18985f, 197.77621f, 202.12709f),
                    PathNode.CurveTo(198.50122f, 200.06433f, 198.04675f, 197.7705f, 196.59f, 196.14f),
                    PathNode.CurveTo(180.86f, 177.41f, 161.0f, 164.48f, 139.0f, 158.25f),
                    PathNode.Close,
                    PathNode.MoveTo(54.0f, 100.0f),
                    PathNode.CurveTo(54.0f, 70.17662f, 78.17662f, 46.0f, 108.0f, 46.0f),
                    PathNode.CurveTo(137.82338f, 46.0f, 162.0f, 70.17662f, 162.0f, 100.0f),
                    PathNode.CurveTo(162.0f, 129.82338f, 137.82338f, 154.0f, 108.0f, 154.0f),
                    PathNode.CurveTo(78.19033f, 153.96693f, 54.033066f, 129.80966f, 54.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(252.24f, 132.24f),
                    PathNode.LineTo(220.24f, 164.24f),
                    PathNode.CurveTo(217.89746f, 166.57962f, 214.10254f, 166.57962f, 211.76f, 164.24f),
                    PathNode.LineTo(195.76f, 148.24f),
                    PathNode.CurveTo(193.55713f, 145.87592f, 193.62213f, 142.19193f, 195.90703f, 139.90703f),
                    PathNode.CurveTo(198.19193f, 137.62213f, 201.87592f, 137.55713f, 204.24f, 139.76f),
                    PathNode.LineTo(216.0f, 151.51f),
                    PathNode.LineTo(243.76f, 123.76f),
                    PathNode.CurveTo(245.25575f, 122.15478f, 247.50844f, 121.494f, 249.63431f, 122.03692f),
                    PathNode.CurveTo(251.76018f, 122.57983f, 253.42018f, 124.23982f, 253.96309f, 126.3657f),
                    PathNode.CurveTo(254.506f, 128.49156f, 253.84523f, 130.74423f, 252.24f, 132.24f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _userCheck!!
    }

private var _userCheck: ImageVector? = null
