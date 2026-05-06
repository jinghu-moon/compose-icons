package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Component: ImageVector
    get() {
        if (_component != null) return _component!!
        _component = lucideOutlineIcon(
            name = "Component",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.536 11.293c-.39 .391-.39 1.023 0 1.414l2.376 2.377c.39 .39 1.024 .39 1.414 0l2.377-2.377c.39-.391 .39-1.023 0-1.414L19.326 8.916c-.39-.39-1.024-.39-1.414 0Z")
            addPathData("M2.297 11.293c-.39 .391-.39 1.023 0 1.414l2.377 2.377c.391 .39 1.024 .39 1.414 0L8.465 12.707c.39-.391 .39-1.023 0-1.414L6.088 8.916c-.39-.39-1.023-.39-1.414 0Z")
            addPathData("M8.916 17.912c-.188 .188-.293 .442-.293 .707 0 .265 .106 .52 .293 .708l2.377 2.376c.391 .39 1.023 .39 1.414 0l2.377-2.376c.188-.188 .293-.442 .293-.708 0-.265-.106-.52-.293-.707L12.707 15.536c-.391-.39-1.023-.39-1.414 0Z")
            addPathData("M8.916 4.674c-.39 .391-.39 1.024 0 1.414l2.377 2.376c.391 .39 1.023 .39 1.414 0L15.084 6.088c.39-.39 .39-1.023 0-1.414L12.707 2.297c-.391-.39-1.023-.39-1.414 0Z")
        }
        return _component!!
    }

private var _component: ImageVector? = null
