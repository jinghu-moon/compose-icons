package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tree: ImageVector
    get() {
        if (_tree != null) return _tree!!
        _tree = phosphorBoldIcon(
            name = "Tree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(201.17f, 59.62f),
                    PathNode.CurveTo(188.36436f, 30.650772f, 159.67334f, 11.964259f, 128.0f, 11.964259f),
                    PathNode.CurveTo(96.32667f, 11.964259f, 67.635635f, 30.650772f, 54.83f, 59.62f),
                    PathNode.CurveTo(18.281136f, 77.58374f, 2.387782f, 121.164024f, 18.79151f, 158.43913f),
                    PathNode.CurveTo(35.195236f, 195.71423f, 78.0652f, 213.43442f, 116.0f, 198.62f),
                    PathNode.LineTo(116.0f, 232.0f),
                    PathNode.CurveTo(116.0f, 238.62741f, 121.37258f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(134.62741f, 244.0f, 140.0f, 238.62741f, 140.0f, 232.0f),
                    PathNode.LineTo(140.0f, 198.64f),
                    PathNode.CurveTo(148.91344f, 202.17084f, 158.41272f, 203.98927f, 168.0f, 204.0f),
                    PathNode.LineTo(169.92f, 204.0f),
                    PathNode.CurveTo(204.9874f, 203.13628f, 234.9081f, 178.38457f, 242.32864f, 144.1004f),
                    PathNode.CurveTo(249.7492f, 109.81625f, 232.74162f, 74.90726f, 201.17f, 59.62f),
                    PathNode.Close,
                    PathNode.MoveTo(169.35f, 180.0f),
                    PathNode.CurveTo(158.96628f, 180.25606f, 148.7438f, 177.39655f, 140.0f, 171.79f),
                    PathNode.LineTo(140.0f, 135.42f),
                    PathNode.LineTo(181.37f, 114.73f),
                    PathNode.CurveTo(185.26855f, 112.84901f, 187.85193f, 109.01419f, 188.13052f, 104.69456f),
                    PathNode.CurveTo(188.40912f, 100.37493f, 186.33977f, 96.24004f, 182.71512f, 93.87383f),
                    PathNode.CurveTo(179.0905f, 91.50763f, 174.47244f, 91.27689f, 170.63f, 93.27f),
                    PathNode.LineTo(140.0f, 108.58f),
                    PathNode.LineTo(140.0f, 88.0f),
                    PathNode.CurveTo(140.0f, 81.37258f, 134.62741f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(121.37258f, 76.0f, 116.0f, 81.37258f, 116.0f, 88.0f),
                    PathNode.LineTo(116.0f, 132.58f),
                    PathNode.LineTo(85.37f, 117.27f),
                    PathNode.CurveTo(79.46207f, 114.41951f, 72.36003f, 116.84118f, 69.42428f, 122.707214f),
                    PathNode.CurveTo(66.48853f, 128.57324f, 68.80709f, 135.70961f, 74.63f, 138.73f),
                    PathNode.LineTo(116.0f, 159.42f),
                    PathNode.LineTo(116.0f, 171.79f),
                    PathNode.CurveTo(107.25016f, 177.38306f, 97.03189f, 180.24138f, 86.65f, 180.0f),
                    PathNode.CurveTo(59.12f, 179.31f, 35.93f, 155.44f, 36.0f, 127.87f),
                    PathNode.CurveTo(36.008614f, 106.675934f, 48.92498f, 87.6242f, 68.61f, 79.77f),
                    PathNode.CurveTo(71.75836f, 78.50068f, 74.221825f, 75.95728f, 75.39f, 72.77f),
                    PathNode.CurveTo(83.45201f, 50.6657f, 104.471375f, 35.95822f, 128.0f, 35.95822f),
                    PathNode.CurveTo(151.52863f, 35.95822f, 172.54799f, 50.6657f, 180.61f, 72.77f),
                    PathNode.CurveTo(181.77815f, 75.95728f, 184.24164f, 78.50068f, 187.39f, 79.77f),
                    PathNode.CurveTo(207.06825f, 87.62149f, 219.98322f, 106.66323f, 220.0f, 127.85f),
                    PathNode.CurveTo(220.08f, 155.41f, 196.88f, 179.29f, 169.35f, 180.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _tree!!
    }

private var _tree: ImageVector? = null
