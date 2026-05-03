package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Clover: ImageVector
    get() {
        if (_clover != null) return _clover!!
        _clover = lucideOutlineIcon(
            name = "Clover",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.17f, 7.83f),
                    PathNode.LineTo(2.0f, 22.0f)
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
                    PathNode.MoveTo(4.02f, 12.0f),
                    PathNode.CurveTo(3.221986f, 11.333269f, 2.854432f, 10.282255f, 3.06301f, 9.263505f),
                    PathNode.CurveTo(3.271588f, 8.244755f, 4.02262f, 7.422759f, 5.018451f, 7.123298f),
                    PathNode.CurveTo(6.014282f, 6.823837f, 7.094123f, 7.095262f, 7.83f, 7.83f),
                    PathNode.CurveTo(7.095262f, 7.094123f, 6.823837f, 6.014282f, 7.123298f, 5.018451f),
                    PathNode.CurveTo(7.422759f, 4.02262f, 8.244755f, 3.271588f, 9.263505f, 3.06301f),
                    PathNode.CurveTo(10.282255f, 2.854432f, 11.333269f, 3.221986f, 12.0f, 4.02f),
                    PathNode.CurveTo(12.666731f, 3.221986f, 13.717745f, 2.854432f, 14.736495f, 3.06301f),
                    PathNode.CurveTo(15.755245f, 3.271588f, 16.577242f, 4.02262f, 16.876703f, 5.018451f),
                    PathNode.CurveTo(17.176163f, 6.014282f, 16.904737f, 7.094123f, 16.17f, 7.83f),
                    PathNode.CurveTo(16.905878f, 7.095262f, 17.985718f, 6.823837f, 18.981548f, 7.123298f),
                    PathNode.CurveTo(19.97738f, 7.422759f, 20.728413f, 8.244755f, 20.93699f, 9.263505f),
                    PathNode.CurveTo(21.145569f, 10.282255f, 20.778013f, 11.333269f, 19.98f, 12.0f),
                    PathNode.CurveTo(20.778013f, 12.666731f, 21.145569f, 13.717745f, 20.93699f, 14.736495f),
                    PathNode.CurveTo(20.728413f, 15.755245f, 19.97738f, 16.577242f, 18.981548f, 16.876703f),
                    PathNode.CurveTo(17.985718f, 17.176163f, 16.905878f, 16.904737f, 16.17f, 16.17f),
                    PathNode.CurveTo(16.904737f, 16.905878f, 17.176163f, 17.985718f, 16.876703f, 18.981548f),
                    PathNode.CurveTo(16.577242f, 19.97738f, 15.755245f, 20.728413f, 14.736495f, 20.93699f),
                    PathNode.CurveTo(13.717745f, 21.145569f, 12.666731f, 20.778013f, 12.0f, 19.98f),
                    PathNode.CurveTo(11.333269f, 20.778013f, 10.282255f, 21.145569f, 9.263505f, 20.93699f),
                    PathNode.CurveTo(8.244755f, 20.728413f, 7.422759f, 19.97738f, 7.123298f, 18.981548f),
                    PathNode.CurveTo(6.823837f, 17.985718f, 7.095262f, 16.905878f, 7.83f, 16.17f),
                    PathNode.CurveTo(6.678487f, 17.227625f, 4.887625f, 17.151514f, 3.83f, 16.0f),
                    PathNode.CurveTo(2.772375f, 14.848486f, 2.848486f, 13.057625f, 4.0f, 12.0f)
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
                    PathNode.MoveTo(7.83f, 7.83f),
                    PathNode.LineTo(16.17f, 16.17f)
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
        return _clover!!
    }

private var _clover: ImageVector? = null
