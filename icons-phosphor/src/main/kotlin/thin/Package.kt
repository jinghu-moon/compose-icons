package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Package: ImageVector
    get() {
        if (_package != null) return _package!!
        _package = phosphorThinIcon(
            name = "Package",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.76f, 69.66f),
                    PathNode.LineTo(133.76f, 21.48f),
                    PathNode.CurveTo(130.17105f, 19.516296f, 125.82895f, 19.516296f, 122.24f, 21.48f),
                    PathNode.LineTo(34.24f, 69.66f),
                    PathNode.CurveTo(30.394829f, 71.76389f, 28.002638f, 75.79688f, 28.0f, 80.18f),
                    PathNode.LineTo(28.0f, 175.82f),
                    PathNode.CurveTo(28.002638f, 180.20311f, 30.394829f, 184.2361f, 34.24f, 186.34f),
                    PathNode.LineTo(122.24f, 234.52f),
                    PathNode.CurveTo(125.826546f, 236.49307f, 130.17345f, 236.49307f, 133.76f, 234.52f),
                    PathNode.LineTo(221.76f, 186.34f),
                    PathNode.CurveTo(225.60518f, 184.2361f, 227.99736f, 180.20311f, 228.0f, 175.82f),
                    PathNode.LineTo(228.0f, 80.18f),
                    PathNode.CurveTo(227.99736f, 75.79688f, 225.60518f, 71.76389f, 221.76f, 69.66f),
                    PathNode.Close,
                    PathNode.MoveTo(126.08f, 28.5f),
                    PathNode.CurveTo(127.27338f, 27.83403f, 128.72662f, 27.83403f, 129.92f, 28.5f),
                    PathNode.LineTo(216.67f, 76.0f),
                    PathNode.LineTo(178.5f, 96.89f),
                    PathNode.CurveTo(178.3188f, 96.739876f, 178.12473f, 96.60601f, 177.92f, 96.49f),
                    PathNode.LineTo(89.92f, 48.31f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 124.5f),
                    PathNode.LineTo(39.33f, 76.0f),
                    PathNode.LineTo(81.56f, 52.87f),
                    PathNode.LineTo(170.23f, 101.41f),
                    PathNode.Close,
                    PathNode.MoveTo(38.08f, 179.3f),
                    PathNode.CurveTo(36.80037f, 178.59985f, 36.00331f, 177.25865f, 36.0f, 175.8f),
                    PathNode.LineTo(36.0f, 83.29f),
                    PathNode.LineTo(124.0f, 131.45f),
                    PathNode.LineTo(124.0f, 226.36f),
                    PathNode.Close,
                    PathNode.MoveTo(217.92f, 179.3f),
                    PathNode.LineTo(217.92f, 179.3f),
                    PathNode.LineTo(132.0f, 226.3f),
                    PathNode.LineTo(132.0f, 131.45f),
                    PathNode.LineTo(172.0f, 109.56f),
                    PathNode.LineTo(172.0f, 152.0f),
                    PathNode.CurveTo(172.0f, 154.20914f, 173.79086f, 156.0f, 176.0f, 156.0f),
                    PathNode.CurveTo(178.20914f, 156.0f, 180.0f, 154.20914f, 180.0f, 152.0f),
                    PathNode.LineTo(180.0f, 105.18f),
                    PathNode.LineTo(220.0f, 83.29f),
                    PathNode.LineTo(220.0f, 175.82f),
                    PathNode.CurveTo(219.99669f, 177.27866f, 219.19963f, 178.61986f, 217.92f, 179.32f),
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
        return _package!!
    }

private var _package: ImageVector? = null
