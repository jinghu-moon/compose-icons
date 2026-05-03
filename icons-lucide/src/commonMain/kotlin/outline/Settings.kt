package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Settings: ImageVector
    get() {
        if (_settings != null) return _settings!!
        _settings = lucideOutlineIcon(
            name = "Settings",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.671f, 4.136f),
                    PathNode.CurveTo(9.785173f, 2.934844f, 10.79393f, 2.017427f, 12.0005f, 2.017427f),
                    PathNode.CurveTo(13.20707f, 2.017427f, 14.215826f, 2.934844f, 14.33f, 4.136f),
                    PathNode.CurveTo(14.39721f, 4.895941f, 14.830661f, 5.575407f, 15.491464f, 5.956677f),
                    PathNode.CurveTo(16.152266f, 6.337948f, 16.957445f, 6.373149f, 17.649f, 6.051f),
                    PathNode.CurveTo(18.745247f, 5.553293f, 20.040245f, 5.968635f, 20.642517f, 7.011105f),
                    PathNode.CurveTo(21.244787f, 8.053574f, 20.957748f, 9.382913f, 19.979f, 10.084f),
                    PathNode.CurveTo(19.354704f, 10.52205f, 18.983046f, 11.236851f, 18.983046f, 11.9995f),
                    PathNode.CurveTo(18.983046f, 12.762149f, 19.354704f, 13.476951f, 19.979f, 13.915f),
                    PathNode.CurveTo(20.957748f, 14.616087f, 21.244787f, 15.945426f, 20.642517f, 16.987896f),
                    PathNode.CurveTo(20.040245f, 18.030363f, 18.745247f, 18.445707f, 17.649f, 17.948f),
                    PathNode.CurveTo(16.957445f, 17.625853f, 16.152266f, 17.661053f, 15.491464f, 18.042322f),
                    PathNode.CurveTo(14.830661f, 18.423594f, 14.39721f, 19.10306f, 14.33f, 19.863f),
                    PathNode.CurveTo(14.215826f, 21.064156f, 13.20707f, 21.981573f, 12.0005f, 21.981573f),
                    PathNode.CurveTo(10.79393f, 21.981573f, 9.785173f, 21.064156f, 9.671f, 19.863f),
                    PathNode.CurveTo(9.603913f, 19.102781f, 9.170316f, 18.42304f, 8.509233f, 18.041723f),
                    PathNode.CurveTo(7.84815f, 17.660406f, 7.04265f, 17.625425f, 6.351f, 17.948f),
                    PathNode.CurveTo(5.254753f, 18.445707f, 3.959753f, 18.030363f, 3.357484f, 16.987896f),
                    PathNode.CurveTo(2.755214f, 15.945426f, 3.042252f, 14.616087f, 4.021f, 13.915f),
                    PathNode.CurveTo(4.645297f, 13.476951f, 5.016954f, 12.762149f, 5.016954f, 11.9995f),
                    PathNode.CurveTo(5.016954f, 11.236851f, 4.645297f, 10.52205f, 4.021f, 10.084f),
                    PathNode.CurveTo(3.043679f, 9.382598f, 2.757397f, 8.054449f, 3.358984f, 7.012713f),
                    PathNode.CurveTo(3.960572f, 5.970978f, 5.254008f, 5.555094f, 6.35f, 6.051f),
                    PathNode.CurveTo(7.041555f, 6.373149f, 7.846734f, 6.337948f, 8.507537f, 5.956677f),
                    PathNode.CurveTo(9.16834f, 5.575407f, 9.60179f, 4.895941f, 9.669f, 4.136f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 12.0f),
                    PathNode.CurveTo(15.0f, 13.656855f, 13.656855f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(10.343145f, 15.0f, 9.0f, 13.656855f, 9.0f, 12.0f),
                    PathNode.CurveTo(9.0f, 10.343145f, 10.343145f, 9.0f, 12.0f, 9.0f),
                    PathNode.CurveTo(13.656855f, 9.0f, 15.0f, 10.343145f, 15.0f, 12.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _settings!!
    }

private var _settings: ImageVector? = null
