package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ForkKnife: ImageVector
    get() {
        if (_forkKnife != null) return _forkKnife!!
        _forkKnife = phosphorThinIcon(
            name = "ForkKnife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(76.0f, 88.0f),
                    PathNode.LineTo(76.0f, 40.0f),
                    PathNode.CurveTo(76.0f, 37.79086f, 77.79086f, 36.0f, 80.0f, 36.0f),
                    PathNode.CurveTo(82.20914f, 36.0f, 84.0f, 37.79086f, 84.0f, 40.0f),
                    PathNode.LineTo(84.0f, 88.0f),
                    PathNode.CurveTo(84.0f, 90.20914f, 82.20914f, 92.0f, 80.0f, 92.0f),
                    PathNode.CurveTo(77.79086f, 92.0f, 76.0f, 90.20914f, 76.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 40.0f),
                    PathNode.LineTo(212.0f, 224.0f),
                    PathNode.CurveTo(212.0f, 226.20914f, 210.20914f, 228.0f, 208.0f, 228.0f),
                    PathNode.CurveTo(205.79086f, 228.0f, 204.0f, 226.20914f, 204.0f, 224.0f),
                    PathNode.LineTo(204.0f, 172.0f),
                    PathNode.LineTo(152.0f, 172.0f),
                    PathNode.CurveTo(149.79086f, 172.0f, 148.0f, 170.20914f, 148.0f, 168.0f),
                    PathNode.CurveTo(148.3681f, 149.15312f, 150.75168f, 130.39972f, 155.11f, 112.06f),
                    PathNode.CurveTo(164.58f, 72.84f, 182.32f, 46.65f, 206.42f, 36.32f),
                    PathNode.CurveTo(207.65686f, 35.788193f, 209.07828f, 35.914288f, 210.20221f, 36.655514f),
                    PathNode.CurveTo(211.32614f, 37.396744f, 212.00177f, 38.65366f, 212.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 46.46f),
                    PathNode.CurveTo(162.25f, 70.33f, 156.81f, 145.75f, 156.1f, 164.0f),
                    PathNode.LineTo(204.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 39.34f),
                    PathNode.CurveTo(115.63549f, 37.15847f, 113.571526f, 35.685493f, 111.39f, 36.05f),
                    PathNode.CurveTo(109.20847f, 36.41451f, 107.73549f, 38.478474f, 108.1f, 40.66f),
                    PathNode.LineTo(116.1f, 88.32f),
                    PathNode.CurveTo(116.1f, 108.20225f, 99.982254f, 124.32f, 80.1f, 124.32f),
                    PathNode.CurveTo(60.21775f, 124.32f, 44.1f, 108.20225f, 44.1f, 88.32f),
                    PathNode.LineTo(52.1f, 40.66f),
                    PathNode.CurveTo(52.464508f, 38.478474f, 50.991524f, 36.41451f, 48.81f, 36.05f),
                    PathNode.CurveTo(46.628475f, 35.685493f, 44.564507f, 37.15847f, 44.2f, 39.34f),
                    PathNode.LineTo(36.2f, 87.34f),
                    PathNode.CurveTo(36.117886f, 87.555016f, 36.051052f, 87.775566f, 36.0f, 88.0f),
                    PathNode.CurveTo(36.032276f, 110.73666f, 53.360058f, 129.7149f, 76.0f, 131.81f),
                    PathNode.LineTo(76.0f, 224.0f),
                    PathNode.CurveTo(76.0f, 226.20914f, 77.79086f, 228.0f, 80.0f, 228.0f),
                    PathNode.CurveTo(82.20914f, 228.0f, 84.0f, 226.20914f, 84.0f, 224.0f),
                    PathNode.LineTo(84.0f, 131.81f),
                    PathNode.CurveTo(106.639946f, 129.7149f, 123.96772f, 110.73666f, 124.0f, 88.0f),
                    PathNode.CurveTo(124.01486f, 87.78025f, 124.01486f, 87.559746f, 124.0f, 87.34f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _forkKnife!!
    }

private var _forkKnife: ImageVector? = null
