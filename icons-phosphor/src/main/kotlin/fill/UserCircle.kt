package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserCircle: ImageVector
    get() {
        if (_userCircle != null) return _userCircle!!
        _userCircle = phosphorFillIcon(
            name = "UserCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.0f, 120.0f),
                    PathNode.CurveTo(172.0f, 144.30052f, 152.30052f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(103.69947f, 164.0f, 84.0f, 144.30052f, 84.0f, 120.0f),
                    PathNode.CurveTo(84.0f, 95.69947f, 103.69947f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(152.28911f, 76.02756f, 171.97244f, 95.71089f, 172.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 185.4376f, 185.4376f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(70.562386f, 232.0f, 24.0f, 185.4376f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 70.562386f, 70.562386f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(185.41248f, 24.060629f, 231.93938f, 70.58752f, 232.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.CurveTo(215.97415f, 104.06727f, 206.21167f, 81.175186f, 188.95808f, 64.58934f),
                    PathNode.CurveTo(171.70451f, 48.003494f, 148.44511f, 39.15169f, 124.53f, 40.07f),
                    PathNode.CurveTo(77.43f, 41.89f, 39.87f, 81.12f, 40.0f, 128.25f),
                    PathNode.CurveTo(40.045162f, 149.70525f, 47.958218f, 170.39874f, 62.24f, 186.41f),
                    PathNode.CurveTo(68.05623f, 177.97409f, 75.444405f, 170.7387f, 84.0f, 165.1f),
                    PathNode.CurveTo(85.49916f, 164.10986f, 87.47457f, 164.24072f, 88.83f, 165.42f),
                    PathNode.CurveTo(111.303246f, 184.85814f, 144.63676f, 184.85814f, 167.11f, 165.42f),
                    PathNode.CurveTo(168.46542f, 164.24072f, 170.44084f, 164.10986f, 171.94f, 165.1f),
                    PathNode.CurveTo(180.5064f, 170.73566f, 187.90495f, 177.97125f, 193.73f, 186.41f),
                    PathNode.CurveTo(208.0824f, 170.34035f, 216.0107f, 149.54588f, 216.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
