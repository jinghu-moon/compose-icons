package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.At: ImageVector
    get() {
        if (_at != null) return _at!!
        _at = phosphorRegularIcon(
            name = "At",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(149.51f, 232.0f, 172.1f, 225.52f, 188.43f, 214.67f),
                    PathNode.CurveTo(192.11098f, 212.22337f, 193.11162f, 207.25598f, 190.665f, 203.575f),
                    PathNode.CurveTo(188.21838f, 199.89403f, 183.25098f, 198.89337f, 179.57f, 201.34f),
                    PathNode.CurveTo(166.0f, 210.38f, 146.21f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(79.39894f, 216.0f, 40.0f, 176.60106f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 79.39894f, 79.39894f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(176.60106f, 40.0f, 216.0f, 79.39894f, 216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 154.45f, 205.12f, 160.0f, 196.0f, 160.0f),
                    PathNode.CurveTo(186.88f, 160.0f, 176.0f, 154.45f, 176.0f, 128.0f),
                    PathNode.LineTo(176.0f, 88.0f),
                    PathNode.CurveTo(176.0f, 83.58172f, 172.41827f, 80.0f, 168.0f, 80.0f),
                    PathNode.CurveTo(163.58173f, 80.0f, 160.0f, 83.58172f, 160.0f, 88.0f),
                    PathNode.LineTo(160.0f, 92.26f),
                    PathNode.CurveTo(145.30812f, 79.08759f, 124.05168f, 76.24841f, 106.41769f, 85.103134f),
                    PathNode.CurveTo(88.7837f, 93.957855f, 78.36522f, 112.702255f, 80.155235f, 132.3532f),
                    PathNode.CurveTo(81.94525f, 152.00414f, 95.57904f, 168.5576f, 114.52269f, 174.08043f),
                    PathNode.CurveTo(133.46634f, 179.60327f, 153.85994f, 172.97017f, 165.93f, 157.36f),
                    PathNode.CurveTo(171.93f, 169.36f, 182.28f, 176.0f, 196.0f, 176.0f),
                    PathNode.CurveTo(218.54f, 176.0f, 232.0f, 158.06f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 160.0f),
                    PathNode.CurveTo(110.32689f, 160.0f, 96.0f, 145.67311f, 96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 110.32689f, 110.32689f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(145.67311f, 96.0f, 160.0f, 110.32689f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 145.67311f, 145.67311f, 160.0f, 128.0f, 160.0f),
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
        return _at!!
    }

private var _at: ImageVector? = null
