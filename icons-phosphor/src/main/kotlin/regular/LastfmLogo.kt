package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LastfmLogo: ImageVector
    get() {
        if (_lastfmLogo != null) return _lastfmLogo!!
        _lastfmLogo = phosphorRegularIcon(
            name = "LastfmLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 160.0f),
                    PathNode.CurveTo(248.0f, 182.09138f, 230.09138f, 200.0f, 208.0f, 200.0f),
                    PathNode.LineTo(190.57f, 200.0f),
                    PathNode.CurveTo(168.82672f, 199.94702f, 149.06337f, 187.36078f, 139.82f, 167.68f),
                    PathNode.LineTo(109.68f, 103.08f),
                    PathNode.CurveTo(103.07731f, 89.02332f, 88.96012f, 80.03506f, 73.43f, 80.0f),
                    PathNode.LineTo(64.0f, 80.0f),
                    PathNode.CurveTo(41.90861f, 80.0f, 24.0f, 97.90861f, 24.0f, 120.0f),
                    PathNode.LineTo(24.0f, 144.0f),
                    PathNode.CurveTo(24.0f, 166.09138f, 41.90861f, 184.0f, 64.0f, 184.0f),
                    PathNode.LineTo(72.0f, 184.0f),
                    PathNode.CurveTo(84.72809f, 184.00458f, 96.24877f, 176.46548f, 101.34f, 164.8f),
                    PathNode.CurveTo(102.441475f, 162.11714f, 104.90868f, 160.24051f, 107.78822f, 159.89526f),
                    PathNode.CurveTo(110.66778f, 159.55002f, 113.50867f, 160.79025f, 115.21313f, 163.13669f),
                    PathNode.CurveTo(116.91759f, 165.48314f, 117.21866f, 168.5683f, 116.0f, 171.2f),
                    PathNode.CurveTo(108.3646f, 188.6949f, 91.0885f, 200.0029f, 72.0f, 200.0f),
                    PathNode.LineTo(64.0f, 200.0f),
                    PathNode.CurveTo(33.085762f, 199.96693f, 8.03307f, 174.91423f, 8.0f, 144.0f),
                    PathNode.LineTo(8.0f, 120.0f),
                    PathNode.CurveTo(8.03307f, 89.08576f, 33.085762f, 64.033066f, 64.0f, 64.0f),
                    PathNode.LineTo(73.43f, 64.0f),
                    PathNode.CurveTo(95.17329f, 64.052986f, 114.93663f, 76.63921f, 124.18f, 96.32f),
                    PathNode.LineTo(154.32f, 160.92f),
                    PathNode.CurveTo(160.9227f, 174.97668f, 175.03989f, 183.96495f, 190.57f, 184.0f),
                    PathNode.LineTo(208.0f, 184.0f),
                    PathNode.CurveTo(221.25484f, 184.0f, 232.0f, 173.25484f, 232.0f, 160.0f),
                    PathNode.CurveTo(232.0f, 146.74516f, 221.25484f, 136.0f, 208.0f, 136.0f),
                    PathNode.LineTo(188.0f, 136.0f),
                    PathNode.CurveTo(168.11777f, 136.0f, 152.0f, 119.88225f, 152.0f, 100.0f),
                    PathNode.CurveTo(152.0f, 80.11775f, 168.11777f, 64.0f, 188.0f, 64.0f),
                    PathNode.LineTo(208.0f, 64.0f),
                    PathNode.CurveTo(225.67311f, 64.0f, 240.0f, 78.32689f, 240.0f, 96.0f),
                    PathNode.CurveTo(240.0f, 100.41828f, 236.41827f, 104.0f, 232.0f, 104.0f),
                    PathNode.CurveTo(227.58173f, 104.0f, 224.0f, 100.41828f, 224.0f, 96.0f),
                    PathNode.CurveTo(224.0f, 87.163445f, 216.83656f, 80.0f, 208.0f, 80.0f),
                    PathNode.LineTo(188.0f, 80.0f),
                    PathNode.CurveTo(176.9543f, 80.0f, 168.0f, 88.95431f, 168.0f, 100.0f),
                    PathNode.CurveTo(168.0f, 111.04569f, 176.9543f, 120.0f, 188.0f, 120.0f),
                    PathNode.LineTo(208.0f, 120.0f),
                    PathNode.CurveTo(230.09138f, 120.0f, 248.0f, 137.90862f, 248.0f, 160.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _lastfmLogo!!
    }

private var _lastfmLogo: ImageVector? = null
