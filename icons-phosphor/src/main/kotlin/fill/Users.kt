package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Users: ImageVector
    get() {
        if (_users != null) return _users!!
        _users = phosphorFillIcon(
            name = "Users",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(164.47f, 195.63f),
                    PathNode.CurveTo(166.07361f, 198.08897f, 166.2016f, 201.22874f, 164.80345f, 203.81009f),
                    PathNode.CurveTo(163.40532f, 206.39142f, 160.70566f, 207.99963f, 157.77f, 208.0f),
                    PathNode.LineTo(10.23f, 208.0f),
                    PathNode.CurveTo(7.294336f, 207.99963f, 4.594683f, 206.39142f, 3.196543f, 203.81009f),
                    PathNode.CurveTo(1.798402f, 201.22874f, 1.926393f, 198.08897f, 3.53f, 195.63f),
                    PathNode.CurveTo(14.791058f, 178.29631f, 31.35492f, 165.06837f, 50.75f, 157.92f),
                    PathNode.CurveTo(28.735247f, 143.26387f, 18.91306f, 115.92182f, 26.568909f, 90.60702f),
                    PathNode.CurveTo(34.22476f, 65.292206f, 57.552856f, 47.975655f, 84.0f, 47.975655f),
                    PathNode.CurveTo(110.44714f, 47.975655f, 133.77524f, 65.292206f, 141.43109f, 90.60702f),
                    PathNode.CurveTo(149.08694f, 115.92182f, 139.26476f, 143.26387f, 117.25f, 157.92f),
                    PathNode.CurveTo(136.64508f, 165.06837f, 153.20894f, 178.29631f, 164.47f, 195.63f),
                    PathNode.Close,
                    PathNode.MoveTo(252.38f, 195.48f),
                    PathNode.CurveTo(241.11592f, 178.2193f, 224.58905f, 165.0483f, 205.25f, 157.92f),
                    PathNode.CurveTo(231.52188f, 140.22308f, 239.511f, 105.15203f, 223.49612f, 77.822266f),
                    PathNode.CurveTo(207.48125f, 50.492508f, 172.9801f, 40.32018f, 144.7f, 54.59f),
                    PathNode.CurveTo(143.64522f, 55.134613f, 142.88683f, 56.119587f, 142.62993f, 57.27854f),
                    PathNode.CurveTo(142.37303f, 58.437492f, 142.64415f, 59.65068f, 143.37f, 60.59f),
                    PathNode.CurveTo(164.16718f, 86.53201f, 165.63887f, 122.99634f, 147.0f, 150.53f),
                    PathNode.CurveTo(145.77838f, 152.35457f, 146.25597f, 154.8228f, 148.07f, 156.06f),
                    PathNode.CurveTo(159.90894f, 164.32275f, 170.04385f, 174.79044f, 177.92f, 186.89f),
                    PathNode.CurveTo(181.09645f, 191.75456f, 182.39386f, 197.60892f, 181.57f, 203.36f),
                    PathNode.CurveTo(181.38232f, 204.51785f, 181.71231f, 205.69972f, 182.47266f, 206.59288f),
                    PathNode.CurveTo(183.23299f, 207.48604f, 184.34705f, 208.00044f, 185.52f, 208.0f),
                    PathNode.LineTo(245.82f, 208.0f),
                    PathNode.CurveTo(249.44197f, 208.00111f, 252.61282f, 205.56862f, 253.55f, 202.07f),
                    PathNode.CurveTo(254.11246f, 199.80681f, 253.68713f, 197.41125f, 252.38f, 195.48f),
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
        return _users!!
    }

private var _users: ImageVector? = null
