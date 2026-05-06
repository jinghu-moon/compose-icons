package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UserSound: ImageVector
    get() {
        if (_userSound != null) return _userSound!!
        _userSound = phosphorRegularIcon(
            name = "UserSound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 165.68c25.766-16.048 37.775-47.23 29.43-76.415C165.084 60.079 138.405 39.96 108.05 39.96c-30.355 0-57.034 20.119-65.38 49.305-8.346 29.185 3.663 60.367 29.43 76.415-20.65 6.76-39.23 19.39-54.17 37.17-2.844 3.383-2.408 8.431 .975 11.275 3.383 2.844 8.431 2.408 11.275-.975C50.25 189.19 77.91 176 108 176c30.09 0 57.75 13.19 77.88 37.15 2.844 3.383 7.892 3.819 11.275 .975 3.383-2.844 3.819-7.892 .975-11.275C183.18 185.07 164.6 172.44 144 165.68ZM56 108C56 79.281 79.281 56 108 56c28.719 0 52 23.281 52 52 0 28.719-23.281 52-52 52C79.295 159.967 56.033 136.705 56 108ZM207.36 65.6c11.52 27.093 11.52 57.707 0 84.8-1.258 2.948-4.155 4.861-7.36 4.86-2.69 .002-5.201-1.348-6.683-3.593-1.482-2.245-1.736-5.084-.677-7.557 9.814-23.073 9.814-49.147 0-72.22-1.737-4.065 .15-8.768 4.215-10.505 4.065-1.737 8.768 .15 10.505 4.215ZM248 108c.038 18.961-3.805 37.729-11.29 55.15-1.82 3.925-6.432 5.692-10.409 3.988-3.977-1.704-5.878-6.262-4.291-10.288 13.32-31.205 13.32-66.495 0-97.7-1.226-2.644-.917-5.745 .805-8.095 1.723-2.35 4.587-3.578 7.477-3.205 2.89 .373 5.348 2.289 6.417 5C244.195 70.271 248.038 89.039 248 108Z"),
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
        return _userSound!!
    }

private var _userSound: ImageVector? = null
