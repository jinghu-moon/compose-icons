package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NotMemberOf: ImageVector
    get() {
        if (_notMemberOf != null) return _notMemberOf!!
        _notMemberOf = phosphorDuotoneIcon(
            name = "NotMemberOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 48.0f),
                    PathNode.LineTo(200.0f, 208.0f),
                    PathNode.LineTo(128.0f, 208.0f),
                    PathNode.CurveTo(83.81722f, 208.0f, 48.0f, 172.18279f, 48.0f, 128.0f),
                    PathNode.LineTo(48.0f, 128.0f),
                    PathNode.CurveTo(48.0f, 83.81722f, 83.81722f, 48.0f, 128.0f, 48.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.38f, 34.08f),
                    PathNode.CurveTo(210.11035f, 31.109032f, 205.05144f, 31.350784f, 202.08f, 34.62f),
                    PathNode.LineTo(197.19f, 40.0f),
                    PathNode.LineTo(128.0f, 40.0f),
                    PathNode.CurveTo(93.12139f, 40.02397f, 61.54855f, 60.645092f, 47.506878f, 92.57235f),
                    PathNode.CurveTo(33.46521f, 124.4996f, 39.605034f, 161.70683f, 63.16f, 187.43f),
                    PathNode.LineTo(42.08f, 210.62f),
                    PathNode.CurveTo(40.116978f, 212.7287f, 39.439384f, 215.73003f, 40.30605f, 218.47755f),
                    PathNode.CurveTo(41.17271f, 221.2251f, 43.44975f, 223.29443f, 46.26741f, 223.89514f),
                    PathNode.CurveTo(49.085068f, 224.49586f, 52.008102f, 223.53516f, 53.92f, 221.38f),
                    PathNode.LineTo(75.0f, 198.2f),
                    PathNode.CurveTo(90.24468f, 209.76971f, 108.86213f, 216.02237f, 128.0f, 216.0f),
                    PathNode.LineTo(200.0f, 216.0f),
                    PathNode.CurveTo(204.41827f, 216.0f, 208.0f, 212.41827f, 208.0f, 208.0f),
                    PathNode.CurveTo(208.0f, 203.58173f, 204.41827f, 200.0f, 200.0f, 200.0f),
                    PathNode.LineTo(128.0f, 200.0f),
                    PathNode.CurveTo(112.844734f, 200.01048f, 98.07667f, 195.21384f, 85.82f, 186.3f),
                    PathNode.LineTo(131.54f, 136.0f),
                    PathNode.LineTo(200.0f, 136.0f),
                    PathNode.CurveTo(204.41827f, 136.0f, 208.0f, 132.41827f, 208.0f, 128.0f),
                    PathNode.CurveTo(208.0f, 123.58172f, 204.41827f, 120.0f, 200.0f, 120.0f),
                    PathNode.LineTo(146.08f, 120.0f),
                    PathNode.LineTo(213.92f, 45.38f),
                    PathNode.CurveTo(216.89098f, 42.11036f, 216.64922f, 37.051437f, 213.38f, 34.08f),
                    PathNode.Close,
                    PathNode.MoveTo(74.0f, 175.53f),
                    PathNode.CurveTo(64.223595f, 164.47302f, 58.098137f, 150.66805f, 56.46f, 136.0f),
                    PathNode.LineTo(109.92f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.46f, 120.0f),
                    PathNode.CurveTo(60.56829f, 83.58154f, 91.35058f, 56.043575f, 128.0f, 56.0f),
                    PathNode.LineTo(182.64f, 56.0f),
                    PathNode.LineTo(124.46f, 120.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _notMemberOf!!
    }

private var _notMemberOf: ImageVector? = null
