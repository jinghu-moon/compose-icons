package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PinterestLogo: ImageVector
    get() {
        if (_pinterestLogo != null) return _pinterestLogo!!
        _pinterestLogo = phosphorBoldIcon(
            name = "PinterestLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 112.0f),
                    PathNode.CurveTo(228.0f, 135.6f, 219.71f, 157.23f, 204.65f, 172.88f),
                    PathNode.CurveTo(190.52f, 187.57f, 171.33f, 196.0f, 152.0f, 196.0f),
                    PathNode.CurveTo(136.55f, 196.0f, 125.22f, 191.82f, 117.11f, 186.69f),
                    PathNode.LineTo(107.68f, 226.75f),
                    PathNode.CurveTo(106.73383f, 230.96149f, 103.59868f, 234.34033f, 99.46965f, 235.59851f),
                    PathNode.CurveTo(95.34062f, 236.8567f, 90.85399f, 235.80034f, 87.72005f, 232.83212f),
                    PathNode.CurveTo(84.586105f, 229.86392f, 83.28778f, 225.44124f, 84.32f, 221.25f),
                    PathNode.LineTo(116.32f, 85.25f),
                    PathNode.CurveTo(117.26617f, 81.038506f, 120.40132f, 77.65966f, 124.53035f, 76.40148f),
                    PathNode.CurveTo(128.65938f, 75.143295f, 133.14601f, 76.19965f, 136.27995f, 79.16787f),
                    PathNode.CurveTo(139.4139f, 82.136086f, 140.71222f, 86.55877f, 139.68f, 90.75f),
                    PathNode.LineTo(123.23f, 160.68f),
                    PathNode.CurveTo(126.72f, 164.86f, 135.16f, 172.0f, 152.0f, 172.0f),
                    PathNode.CurveTo(177.56f, 172.0f, 204.0f, 149.55f, 204.0f, 112.0f),
                    PathNode.CurveTo(203.98523f, 83.422165f, 186.10388f, 57.90295f, 159.24806f, 48.132668f),
                    PathNode.CurveTo(132.39226f, 38.362385f, 102.29327f, 46.426098f, 83.918846f, 68.31385f),
                    PathNode.CurveTo(65.544426f, 90.2016f, 62.815853f, 121.24235f, 77.09f, 146.0f),
                    PathNode.CurveTo(80.14583f, 151.7094f, 78.12045f, 158.81357f, 72.51327f, 162.05315f),
                    PathNode.CurveTo(66.90609f, 165.29274f, 59.739918f, 163.49905f, 56.32f, 158.0f),
                    PathNode.CurveTo(36.98709f, 124.50489f, 40.666073f, 82.49497f, 65.526665f, 52.87007f),
                    PathNode.CurveTo(90.38725f, 23.245173f, 131.12112f, 12.330925f, 167.46326f, 25.557144f),
                    PathNode.CurveTo(203.80539f, 38.783363f, 227.9959f, 73.32593f, 228.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pinterestLogo!!
    }

private var _pinterestLogo: ImageVector? = null
