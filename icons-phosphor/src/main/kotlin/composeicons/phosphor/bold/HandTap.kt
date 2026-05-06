package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandTap: ImageVector
    get() {
        if (_handTap != null) return _handTap!!
        _handTap = phosphorBoldIcon(
            name = "HandTap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 156v36c0 13.85-1.63 26.52-4.58 35.68-1.26 4.149-4.659 7.295-8.893 8.23-4.233 .936-8.642-.485-11.533-3.716-2.891-3.231-3.814-7.771-2.414-11.874C202.72 213.67 204 203.08 204 192v-36c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v4c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-20c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v12c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-68c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v108c-.006 5.352-3.556 10.053-8.702 11.524-5.146 1.471-10.644-.644-13.478-5.184l-18.68-30L66.93 168c-2.187-3.847-7.078-5.192-10.925-3.005-3.847 2.187-5.192 7.078-3.005 10.925l25.27 41.88c3.421 5.677 1.592 13.054-4.085 16.475-5.677 3.421-13.054 1.592-16.475-4.085l-25.31-42-.12-.2c-8.226-14.241-4.318-32.398 9.037-41.994 13.356-9.596 31.811-7.506 42.683 4.834v-66.83C84 66.327 98.327 52 116 52c17.673 0 32 14.327 32 32v25c14.743-3.805 30.126 3.305 36.78 17 9.831-3.681 20.843-2.305 29.467 3.681 8.624 5.986 13.763 15.821 13.753 26.319ZM56 96c6.627 0 12-5.373 12-12C68 57.49 89.49 36 116 36c26.51 0 48 21.49 48 48 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12C188 44.235 155.764 12 116 12 76.235 12 44 44.235 44 84c0 6.627 5.373 12 12 12Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _handTap!!
    }

private var _handTap: ImageVector? = null
