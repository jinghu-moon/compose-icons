package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.MegaphoneSimple: ImageVector
    get() {
        if (_megaphoneSimple != null) return _megaphoneSimple!!
        _megaphoneSimple = phosphorThinIcon(
            name = "MegaphoneSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.41f, 90.5f),
                    PathNode.LineTo(51.41f, 36.5f),
                    PathNode.CurveTo(47.780724f, 35.424335f, 43.85667f, 36.124157f, 40.822987f, 38.3881f),
                    PathNode.CurveTo(37.7893f, 40.652046f, 36.00167f, 44.214672f, 36.0f, 48.0f),
                    PathNode.LineTo(36.0f, 192.0f),
                    PathNode.CurveTo(36.0f, 198.62741f, 41.37258f, 204.0f, 48.0f, 204.0f),
                    PathNode.CurveTo(49.167797f, 203.99649f, 50.329254f, 203.82816f, 51.45f, 203.5f),
                    PathNode.LineTo(140.0f, 176.32f),
                    PathNode.LineTo(140.0f, 192.0f),
                    PathNode.CurveTo(140.0f, 198.62741f, 145.37259f, 204.0f, 152.0f, 204.0f),
                    PathNode.LineTo(184.0f, 204.0f),
                    PathNode.CurveTo(190.62741f, 204.0f, 196.0f, 198.62741f, 196.0f, 192.0f),
                    PathNode.LineTo(196.0f, 159.14f),
                    PathNode.LineTo(227.39f, 149.51f),
                    PathNode.CurveTo(232.48267f, 147.98965f, 235.97972f, 143.31471f, 236.0f, 138.0f),
                    PathNode.LineTo(236.0f, 102.0f),
                    PathNode.CurveTo(235.99765f, 96.68792f, 232.50308f, 92.009514f, 227.41f, 90.5f),
                    PathNode.Close,
                    PathNode.MoveTo(49.12f, 195.84f),
                    PathNode.CurveTo(47.91133f, 196.19254f, 46.607224f, 195.95541f, 45.6f, 195.2f),
                    PathNode.CurveTo(44.592777f, 194.44458f, 44.0f, 193.25903f, 44.0f, 192.0f),
                    PathNode.LineTo(44.0f, 48.0f),
                    PathNode.CurveTo(44.0f, 46.74097f, 44.592777f, 45.555416f, 45.6f, 44.8f),
                    PathNode.CurveTo(46.292385f, 44.280712f, 47.134518f, 44.0f, 48.0f, 44.0f),
                    PathNode.CurveTo(48.361908f, 43.99998f, 48.722046f, 44.05047f, 49.07f, 44.15f),
                    PathNode.LineTo(140.0f, 72.05f),
                    PathNode.LineTo(140.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 192.0f),
                    PathNode.CurveTo(188.0f, 194.20914f, 186.20914f, 196.0f, 184.0f, 196.0f),
                    PathNode.LineTo(152.0f, 196.0f),
                    PathNode.CurveTo(149.79086f, 196.0f, 148.0f, 194.20914f, 148.0f, 192.0f),
                    PathNode.LineTo(148.0f, 173.87f),
                    PathNode.LineTo(188.0f, 161.6f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 138.0f),
                    PathNode.CurveTo(228.0f, 139.77777f, 226.82666f, 141.34222f, 225.12f, 141.84f),
                    PathNode.LineTo(225.07f, 141.84f),
                    PathNode.LineTo(148.0f, 165.5f),
                    PathNode.LineTo(148.0f, 74.5f),
                    PathNode.LineTo(225.12f, 98.16f),
                    PathNode.CurveTo(226.82666f, 98.657776f, 228.0f, 100.22222f, 228.0f, 102.0f),
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
        return _megaphoneSimple!!
    }

private var _megaphoneSimple: ImageVector? = null
