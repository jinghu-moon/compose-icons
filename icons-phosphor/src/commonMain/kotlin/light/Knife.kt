package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Knife: ImageVector
    get() {
        if (_knife != null) return _knife!!
        _knife = phosphorLightIcon(
            name = "Knife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.46f, 33.55f),
                    PathNode.CurveTo(220.3818f, 23.4778f, 204.04819f, 23.4778f, 193.97f, 33.55f),
                    PathNode.LineTo(19.76f, 207.82f),
                    PathNode.CurveTo(18.217154f, 209.36177f, 17.632519f, 211.61937f, 18.2331f, 213.71622f),
                    PathNode.CurveTo(18.833685f, 215.81306f, 20.52487f, 217.41882f, 22.65f, 217.91f),
                    PathNode.CurveTo(34.370075f, 220.62198f, 46.360245f, 221.99411f, 58.39f, 222.0f),
                    PathNode.CurveTo(90.96f, 222.0f, 123.56f, 211.9f, 154.26f, 192.09f),
                    PathNode.CurveTo(185.75f, 171.77f, 203.98f, 148.7f, 204.74f, 147.73f),
                    PathNode.CurveTo(206.60684f, 145.33986f, 206.39656f, 141.93246f, 204.25f, 139.79f),
                    PathNode.LineTo(182.49f, 118.0f),
                    PathNode.LineTo(230.49f, 70.0f),
                    PathNode.CurveTo(240.4999f, 59.90686f, 240.4865f, 43.626648f, 230.46f, 33.55f),
                    PathNode.Close,
                    PathNode.MoveTo(191.86f, 144.37f),
                    PathNode.CurveTo(178.873f, 158.79602f, 164.04207f, 171.44821f, 147.75f, 182.0f),
                    PathNode.CurveTo(111.5f, 205.4f, 74.0f, 214.23f, 36.23f, 208.32f),
                    PathNode.LineTo(146.0f, 98.5f),
                    PathNode.Close,
                    PathNode.MoveTo(222.0f, 61.56f),
                    PathNode.LineTo(174.0f, 109.56f),
                    PathNode.LineTo(154.49f, 90.0f),
                    PathNode.LineTo(202.49f, 42.0f),
                    PathNode.CurveTo(207.89134f, 36.61246f, 216.63747f, 36.623657f, 222.025f, 42.025f),
                    PathNode.CurveTo(227.41254f, 47.426346f, 227.40134f, 56.172462f, 222.0f, 61.56f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _knife!!
    }

private var _knife: ImageVector? = null
